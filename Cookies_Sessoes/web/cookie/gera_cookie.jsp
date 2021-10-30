<%@page import="java.net.URLEncoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalhando com Cookies</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");

            //recupera os valoes do form:
            String nome = (request.getParameter("nome") != null)
                    ? request.getParameter("nome") : "";

            String sobrenome = (request.getParameter("sobrenome") != null)
                    ? request.getParameter("sobrenome") : "";

            //Cria duas variáveis String com os valores recuperados 
            //codificando-os em UTF-8
            String nomeUTF = URLEncoder.encode(nome, "UTF-8");
            String sobrenomeUTF = URLEncoder.encode(sobrenome, "UTF-8");

            //Gera os objetos das cookies:
            Cookie cookieNome = new Cookie("cookieNome", nomeUTF);
            Cookie cookieSobrenome = new Cookie("cookieSobrenome", sobrenomeUTF);

            //Seta a versão das cookies para a mais compatível:
            cookieNome.setVersion(0);
            cookieSobrenome.setVersion(0);

            //Seta a duração das cookies (em SEGUNDOS):
            //se não colocar essas configurações, a cookies é "infinita"
            //infinita = até o usuário limpar seus cookies do browser
            cookieNome.setMaxAge(120); //dois minutos
            cookieSobrenome.setMaxAge(180); //três minutos

            //Envia os cookeis para o cliente:
            response.addCookie(cookieNome);
            response.addCookie(cookieSobrenome);

        %>
        <h1>Trabalhando com Cookies - Inclusão</h1>
        <hr>
        <br>
        <h3>Olá <%= nome + " " + sobrenome%>! Seja muito bem-vindo(a)! :D</h3>

        <h4>Seus dados foram armazenados em Cookies!</h4>

        <br><br>

        <a href="./">Voltar para a página inicial das cookies</a>  
    </body>
</html>
