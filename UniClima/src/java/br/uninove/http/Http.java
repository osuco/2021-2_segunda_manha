package br.uninove.http;

import br.uninove.uniclima.Clima;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Http {

    //este método é usado para obter um objeto da classe "Clima"
    //através da chamada da API do "OpenWeatherMap"
    public static Clima getClima(String cidade) {
        try {

            //1º passo: montar a requisição para a API
            String url = "http://api.openweathermap.org/data/2.5/weather"; //url da API
            String appid = ""; //Coloque a SUA chave de API
            String units = "metric"; //Unidades que queremos que retorn
            String lang = "pt_br"; //Idioda de retorno
            String charset = StandardCharsets.UTF_8.name(); //Codificação para os parâmetros

            //montagem dos parâmetros da URL:
            String query = String.format("q=%s&appid=%s&units=%s&lang=%s",
                    URLEncoder.encode(cidade, charset),
                    URLEncoder.encode(appid, charset),
                    URLEncoder.encode(units, charset),
                    URLEncoder.encode(lang, charset));

            //2º passo: Abrir a conexão com a API
            URLConnection conn = new URL(url + "?" + query).openConnection(); //Abre a conexão
            conn.setRequestProperty("Accept-Charset", charset); //Define a propriedade "Accept-charset do protocolo http
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8"); //Define o tipo de arquivo retornado para o protocolo HTTP
            conn.setDoInput(true);

            //3º passo: Conectar e converter para um objeto de "Clima"
            Clima clima; //instância da classe "Clima" (objeto clima)

            
            try (InputStream resposta = conn.getInputStream()) { //"tenta" ler o resultado da API do OpenWeather
                BufferedReader buffer = new BufferedReader(
                        new InputStreamReader(resposta, charset)); //Guarda o resultado em um "buffer"

                //4º passo: extrair o JSON de retorno:
                String json = readAll(buffer); 
                
                //5º passo: Converter esse JSON para um objeto de "Clima":
                clima = new Gson().fromJson(json, Clima.class); //Converte
            }

            //retorna o objeto de "Clina" já setado:
            return clima;
        } catch (JsonSyntaxException | IOException ex) {
            return null;
        }
    }

    //método para leitura e "limpeza" do Buffer:
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}
