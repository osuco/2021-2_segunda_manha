<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalhando com Sessões</title>
    </head>
    <body>
        <h1>Trabalhando com Sessões - Inclusão</h1>
        <hr>
        <br>
        <%
            request.setCharacterEncoding("UTF-8");
            
            String nome = (request.getParameter("nome") != null)
                    ? request.getParameter("nome") : "";

            String sobrenome = (request.getParameter("sobrenome") != null)
                    ? request.getParameter("sobrenome") : "";
            
            session.setAttribute("nomeSessao", nome);
            session.setAttribute("sobrenomeSessao", sobrenome);
        %>
        
        <h3>Olá <%= nome + " " + sobrenome %>! Seja muito bem-vindo(a)! :D</h3>
        
        <h4>Seus dados foram armazenados na sessão!</h4>
        
        <br><br>
        
        <a href="./">Voltar para a página inicial da sessão</a>  
    </body>
</html>
