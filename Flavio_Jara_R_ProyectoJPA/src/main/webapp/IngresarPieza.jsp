<%-- 
    Document   : IngresarPieza
    Created on : 27-07-2021, 18:37:09
    Author     : Intr4Snak3
--%>

<%@page import="javax.ejb.EJB"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.flavio_jara_r_proyectojpa.entidades.Categoria"%>
<%@page import="com.mycompany.flavio_jara_r_proyectojpa.entidades.Categoria"%>
<%@page import="com.mycompany.flavio_jara_r_proyectojpa.ejb.CategoriaFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/style.css" type="text/css"/>
        <title>Ingresar Piezas</title>
    </head>
    <body>
        <h1>Ingreso de Piezas</h1>
        <form action="<%= request.getContextPath()%>/RegistroPiezaServlet" method="get">
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
                <tr>
                    <td>
                        <label>Color</label>
                    </td>
                    <td>:</td>
                    <td>
                        <input type="text" name="color" id="txtcolor" required="true" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Precio</label>
                    </td>
                    <td>:</td>
                    <td>
                        <input type="number" name="precio" id="txtprecio" required="true" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Id Proveedor</label>
                    </td>
                    <td>:</td>
                    <td>
                        <input type="number" name="idproveedor" id="txtidproveedor" required="true" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Id Categoria</label>                        
                    </td>
                    <td>:</td>
                    <td>
                        <input type="number" name="idcategoria" id="txtidcategoria" required="true" />
                    </td>
                </tr>
            </table>
            <button type="submit" id="btnIngresar">Ingresar</button>
        </form>
        <button onclick="window.location='index.html'" id="btnVolver">Volver</button>
    </body>
</html>
