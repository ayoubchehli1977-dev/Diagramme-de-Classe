package bilbio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Houda
 */
public class Auteur {
    String nom;
    String prenom;
    int naissance;
    
    public Auteur(String nom, String prenom, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
    }
    public void afficherAuteur() {
        System.out.println(prenom + " " + nom + " (né en " + naissance + ")");
    }
    
}
