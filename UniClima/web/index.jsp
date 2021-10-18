<%@page import="br.uninove.utils.StrUtils"%>
<%@page import="br.uninove.http.Http"%>
<%@page import="br.uninove.uniclima.Clima"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    String cidade = "";
    Clima clima = null;

    if (request.getParameter("cidade") != null) {
        cidade = request.getParameter("cidade");
        clima = Http.getClima(cidade);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UniClima</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <link rel="shortcut icon" href="img/favicon.png" type="image/x-icon" />
        <style>
            .clima-card {
                padding: 40px 0 0 0;
                width: 400px;
                margin: 0 auto;
            }  
        </style>
    </head>
    <body>

        <!-- Barra de navegação da página -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.jsp">UniClima</a>
                <form class="d-flex" method="post">
                    <input type="search" class="form-control me-2" value="<%=cidade%>" 
                           name="cidade" placeholder="Nome da cidade">
                    <button class="btn btn-outline-warning" type="submit">Buscar</button>
                </form>
            </div>
        </nav>
        <!-- Fim da NavBar -->

        <!--corpo da página com dados climáticos-->
        <% if (clima != null) {%>

        <div class="clima-card">
            <div class="card">
                <div class="card-body">
                    <div class="text-center">
                        <img src="http://openweathermap.org/img/wn/<%=clima.getWeather().get(0).getIcon()%>@2x.png">
                        <h3>Cidade: <%= clima.getName() + ", " + clima.getSys().getCountry()%></h3>
                    </div>
                    <hr>
                    <div>
                        <p><strong>Agora: </strong><%= StrUtils.capitalize(clima.getWeather().get(0).getDescription())%></p>
                        <p><strong>Temperatura: </strong><%= Math.round(clima.getMain().getTemp())%> ºC</p>
                        <p><strong>Máxima: </strong><%= Math.round(clima.getMain().getTempMax())%> ºC</p>
                        <p><strong>Mínima: </strong><%= Math.round(clima.getMain().getTempMin())%> ºC</p>
                        <p><strong>Sensação Térmica: </strong><%= Math.round(clima.getMain().getFeelsLike())%> ºC</p>
                        <p><strong>Umidade: </strong><%= clima.getMain().getHumidity()%>%</p>
                        <p><strong>Pressão: </strong><%= clima.getMain().getPressure()%>hPa</p>
                        <p><strong>Visibilidade: </strong><%= clima.getVisibility()%>Km</p>
                    </div>
                    <hr>
                    <div>
                        <h5>Vento</h5>
                        <ul>
                            <li><strong>Direção: </strong><%= clima.getWind().getDeg()%>º</li>
                            <li><strong>Velocidade: </strong><%= clima.getWind().getSpeed()%>m/s</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- Se os dados climáticos não estão setados: -->
        <% } else {%>

        <div class="clima-card">
            <div class="card">
                <div class="card-body">
                    <div class="text-center">
                        <h4> <%= cidade.isEmpty() ? "Digite uma cidade" : "Cidade não encontrada"%> </h4>
                    </div>
                </div>
            </div>
        </div>

        <% }%>
    </body>
</html>
