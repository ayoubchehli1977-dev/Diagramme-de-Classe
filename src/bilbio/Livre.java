package bilbio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Houda
 */
public class Livre {
    
    private String titre;
    private int nbPages;
    private Auteur auteur;
    
    public Livre(String titre, int nbPages, Auteur auteur) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.auteur = auteur;
        }
    
        public void afficherLivre() {
        System.out.print("Titre : " + titre + " | Pages : " + nbPages + " | ");
        auteur.afficherAuteur();
    }
        
}
