/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierregau.finalproject;

import java.util.ArrayList;

/**
 *
 * @author pgaut
 */
public class GestionEtudiants
{
    private static ArrayList<Etudiant> listeEtudiants;
    
    public static ArrayList<Etudiant> getListeEtudiants()
    {
        if(listeEtudiants == null)
            listeEtudiants = new ArrayList<>();
        
        return listeEtudiants;
    }
}
