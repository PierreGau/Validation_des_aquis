/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.pierregau.finalproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pgaut
 */
@WebServlet(urlPatterns = {"/etudiants"})
public class AffichageEtudiants extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        ArrayList<Etudiant> listeEtudiant = GestionEtudiants.getListeEtudiants();
        
        listeEtudiant.add(new Etudiant("1","Etudiant1", 15));
        listeEtudiant.add(new Etudiant("2","Etudiant2", 7));
        listeEtudiant.add(new Etudiant("3","Etudiant3", 11));
        listeEtudiant.add(new Etudiant("4","Etudiant4", 13));
        listeEtudiant.add(new Etudiant("5","Etudiant5", 9));
        
        request.setAttribute("listeEtudiant", listeEtudiant);
        request.getRequestDispatcher("WEB-INF/AffichageEtudiantsJSP.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
