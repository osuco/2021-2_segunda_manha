<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalhando com Sessões</title>
    </head>
    <body>
        <h1>Trabalhando com Sessões - Dados</h1>
        <hr>
        <br>
        <%
            request.setCharacterEncoding("UTF-8");
            String nome = "";
            String sobrenome = "";

//            if(session.getAttribute("nomeSessao") != null) {
//                nome = session.getAttribute("nomeSessao").toString();
//            } else {
//                nome = "";
//            }
//              OU, com if ternário...
            nome = (session.getAttribute("nomeSessao") != null)
                    ? session.getAttribute("nomeSessao").toString() : "";

            sobrenome = (session.getAttribute("sobrenomeSessao") != null)
                    ? session.getAttribute("sobrenomeSessao").toString() : "";
        %>
        <h3>Dados armazenados na sessão:</h3>
        <br>
        <ul>
            <li><b>Nome: </b><%= nome %> </li>
            <li><b>Sobrenome: </b><%= sobrenome %> </li>
        </ul>
        <br>
        <a href="./">Voltar para a página inicial da sessão</a>
    </body>
</html>
