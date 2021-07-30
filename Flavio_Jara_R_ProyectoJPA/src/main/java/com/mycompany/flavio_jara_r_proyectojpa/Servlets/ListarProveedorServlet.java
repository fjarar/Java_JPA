/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flavio_jara_r_proyectojpa.Servlets;

import com.mycompany.flavio_jara_r_proyectojpa.ejb.ProveedorFacade;
import com.mycompany.flavio_jara_r_proyectojpa.entidades.Proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Intr4Snak3
 */
@WebServlet(name = "ListarProveedorServlet", urlPatterns = {"/ListarProveedorServlet"})
public class ListarProveedorServlet extends HttpServlet {

    @EJB
    private ProveedorFacade proveedorFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Listar Proveedores</title>");
            out.println("<link rel='stylesheet' href='style/style.css' type='text/css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listado de Proveedores</h1>");
            out.println("<br/>");
            out.println("<table id='tables' style='width:40%;'>");

            List<Proveedor> lista = proveedorFacade.findAll();

            if (lista.size() > 0) {
                out.println("<tr>"
                        + "<th>ID</th>"
                        + "<th>NOMBRE</th>"
                        + "<th>DIRECCION</th>"
                        + "<th>COMUNA</th>"
                        + "<th>PROVINCIA</th>"
                        + "</tr>");
                for (int i = 0; i < lista.size(); i++) {
                    out.println("<tr>"
                            + "<td>" + lista.get(i).getId() + "</td>"
                            + "<td>" + lista.get(i).getNombre_prov() + "</td>"
                            + "<td>" + lista.get(i).getDireccion_prov()+ "</td>"
                            + "<td>" + lista.get(i).getCiudad()+ "</td>"
                            + "<td>" + lista.get(i).getProvincia()+ "</td>"
                            + "</tr>");
                }
            } else {
                out.println("<p class='lst_vacia'>No hay proveedores disponibles para mostrar.</p>");
            }

            out.println("</table>");
            out.println("<button onclick=\"window.location='index.html'\" id=\"btnVolver\">Volver</button>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
