<%-- 
    Document   : IngresarCategoria
    Created on : 27-07-2021, 18:36:54
    Author     : Intr4Snak3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Categorías</title>
        <link rel="stylesheet" href="style/style.css" type="text/css"/>
    </head>
    <body>
        <h1>Ingreso de Categorías</h1>
        <form action="<%= request.getContextPath()%>/RegistroCategoriaServlet" method="post">
            <table>
                <tr>
                    <td>
                        <label>Nombre</label>
                    </td>
                    <td>:</td>
                    <td>
                        <input type="text" name="nombre" id="txtnombre" required="true" />
                    </td>
                </tr>
            </table>
            <button type="submit" id="btnIngresar">Ingresar</button>
        </form>
        <button onclick="window.location='index.html'" id="btnVolver">Volver</button>
    </body>
</html>
