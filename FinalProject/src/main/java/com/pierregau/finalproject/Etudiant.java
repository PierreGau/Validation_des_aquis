/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pierregau.finalproject;

/**
 *
 * @author pgaut
 */
public class Etudiant
{
    private String id, nom, photo;
    private double moyenne;

    public Etudiant(String id, String nom, double moyenne, String photo) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
    
    public boolean equals(String id)
    {
        return this.id.equals(id);
    }
}
