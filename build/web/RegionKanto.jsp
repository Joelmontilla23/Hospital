<%-- 
    Document   : RegionKanto
    Created on : Oct 1, 2022, 12:37:59 PM
    Author     : Joel Montilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista y Datos de los pacientes de los CM de Kanto</title>
    </head>
    <body bgcolor="D7BDE2">
        <h1 align="center"><font color="beige">Lista y Datos de los pacientes de los CM de Johto</font></h1>

        <p>
        <%@ page import = "hospital.RegionKanto" %>
        <%@ page import = "hospital.IImprimision" %>
       <%@ page import = "hospital.ListaPacientes" %>
       <%
            IImprimision Kanto = new RegionKanto();    
       %>
        </p>
        <p><h1 align="center"><font color="beige">Lista:</font></h1></p>
       <br>
       <p align="center"><font color="beige"><%= Kanto.impresion()%></font></p>
    </body>
</html>
