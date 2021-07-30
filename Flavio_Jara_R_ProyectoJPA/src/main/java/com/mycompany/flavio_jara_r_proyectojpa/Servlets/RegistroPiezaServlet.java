/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flavio_jara_r_proyectojpa.Servlets;

import com.mycompany.flavio_jara_r_proyectojpa.ejb.PiezaFacade;
import com.mycompany.flavio_jara_r_proyectojpa.entidades.Pieza;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "RegistroPiezaServlet", urlPatterns = {"/RegistroPiezaServlet"})
public class RegistroPiezaServlet extends HttpServlet {
    
    
    @EJB
    private PiezaFacade piezaFacade;
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
        
        String nombre = request.getParameter("nombre");
        String color = request.getParameter("color");
        int precio = Integer.parseInt(request.getParameter("precio"));
        int idProveedor = Integer.parseInt(request.getParameter("idproveedor"));
        int idCategoria = Integer.parseInt(request.getParameter("idcategoria"));
        
        Pieza pieza = new Pieza();
        
        pieza.setNombre_pieza(nombre);
        pieza.setColor_pieza(color);
        pieza.setPrecio(precio);
        pieza.setProv_pieza(idProveedor);
        pieza.setCat_pieza(idCategoria);
        
        piezaFacade.create(pieza);
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registro Piezas</title>");
            out.println("<link rel='stylesheet' href='style/style.css' type='text/css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Pieza Guardada Exitosamente</h1>");
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
