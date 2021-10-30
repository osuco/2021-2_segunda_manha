<%@page import="java.net.URLDecoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //Cookie1 : cookieNome
    //Cookie2 : cookieSobrenome

    //pega as cookies do usuário de nossa aplicação:
    Cookie cookiesUsuario[] = request.getCookies();

    //cooies auxiliares que receberão as cookies que estamos procurando:
    Cookie cookieNome = null;
    Cookie cookieSobrenome = null;

    //se a lista de cookies do usuário não está vazia....
    if (cookiesUsuario != null) {

        //busca as cookies na lista:
        for (int i = 0; i < cookiesUsuario.length; i++) {
            //busca a primeira cookie:
            if (cookiesUsuario[i].getName().equals("cookieNome")) {
                cookieNome = cookiesUsuario[i];
            }

            //busca a segunda cookies
            if (cookiesUsuario[i].getName().equals("cookieSobrenome")) {
                cookieSobrenome = cookiesUsuario[i];
            }

            //para o loop se encontrar as duas cookies
            if (cookieNome != null && cookieSobrenome != null) {
                break;
            }
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalhando com Cookies</title>
    </head>
    <body>
        <h1>Trabalhando com Cookies - Recuperando os Valores</h1>
        <hr>
        <br>
        <% if (cookieNome != null && cookieSobrenome != null) {%>
            <ul>
                <li><b>Nome: </b><%= URLDecoder.decode(cookieNome.getValue() , "UTF-8") %> </li>
                <li><b>Sobrenome: </b><%= URLDecoder.decode(cookieSobrenome.getValue() , "UTF-8") %> </li>
            </ul>
        <% } else { %>
            <h3>Nenhum cookie encontrado! :(</h3>
        <% } %>
        <br>
        <a href="./">Voltar para a página inicial da sessão</a>
    </body>
</html>
