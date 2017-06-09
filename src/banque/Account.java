/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author Lamine Dieng
 */

//Classe abstraite
public abstract class Account {
    int numero;
    double solde;
    String nom;
    String prenom;

    public Account(int numero, double solde, String nom, String prenom) {
        this.numero = numero;
        this.solde = solde;
        this.nom = nom;
        this.prenom = prenom;
    }

    
    
    public abstract void retrait(double sommeRetrait);
    public abstract void depot(double sommeDepot);
    public abstract double getSolde();
    public abstract void afficherSolde();
    
}
