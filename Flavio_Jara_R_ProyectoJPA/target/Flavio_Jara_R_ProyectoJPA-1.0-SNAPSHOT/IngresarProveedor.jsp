<%-- 
    Document   : IngresarProveedor
    Created on : 27-07-2021, 18:38:13
    Author     : Intr4Snak3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/style.css" type="text/css"/>
        <title>Ingresar Proveedor</title>
    </head>
    <body>
        <h1>Ingreso de proveedores</h1>
        <form action="<%= request.getContextPath()%>/RegistroProveedorServlet" method="post">
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
                        <label>Direccion</label>
                    </td>
                    <td>:</td>
                    <td>
                        <input type="text" name="direccion" id="txtdireccion" required="true" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Ciudad</label>
                    </td>
                    <td>:</td>
                    <td>
                        <input type="text" name="ciudad" id="txtciudad" required="true" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Provincia</label>
                    </td>
                    <td>:</td>
                    <td>
                        <input type="text" name="provincia" id="txtprovincia" required="true" />
                    </td>
                </tr>
            </table>
            <button type="submit" id="btnIngresar">Ingresar</button>
        </form>
        <button onclick="window.location = 'index.html'" id="btnVolver">Volver</button>
    </body>
</html>
