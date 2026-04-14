/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilbio;

/**
 *
 * @author Houda
 */
public class Bilbio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Auteur auteur1 = new Auteur("Saint-Exupéry", "Antoine", 1902);
        Auteur auteur2 = new Auteur("Saint-Exupéry", "Antoine", 1900);
        Auteur auteur3 = new Auteur("Camus", "Albert", 1913);

       
        Livre livre1 = new Livre("Le Petit Prince", 96, auteur1);
        Livre livre2 = new Livre("Vol de nuit", 248, auteur2);
        Livre livre3 = new Livre("L'Étranger", 184, auteur3);

       
        System.out.println("--- Liste des livres ---");
        
        livre1.afficherLivre();
        livre2.afficherLivre();
        livre3.afficherLivre();
    }
}