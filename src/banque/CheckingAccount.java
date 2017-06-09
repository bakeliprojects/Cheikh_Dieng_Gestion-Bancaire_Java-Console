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
public class CheckingAccount extends Account {
    
    public CheckingAccount(int numero, double solde, String nom, String prenom) {
        super(numero, solde, nom, prenom);
    }

    public void retrait(double sommeRetrait) {
        if (solde >=sommeRetrait )
        {
          System.out.println("*************************RETRAIT*******************************");
            solde -=sommeRetrait ; 
            
            System.out.println("Nom :"+nom);
            System.out.println("Prenom :"+prenom);
            System.out.println("Numero :"+numero);
            System.out.println("Montant retiré :"+sommeRetrait);
            System.out.println("Nouveau solde :"+solde);
    }else{
            System.out.println("Le montant de votre solde est insuffisant pour effectuer cette opération ");
        }
    }

    @Override
    public void depot(double sommeDepot) {
        System.out.println("****************************DEPOT*****************************");
        this.solde += sommeDepot;
        System.out.println("Nom :"+nom);
        System.out.println("Prenom :"+prenom);
        System.out.println("Numero :"+numero);
        System.out.println("Montant deposé :"+sommeDepot);
        System.out.println("Nouveau solde :"+solde);
    }

    @Override
    public double getSolde() {
        return this.solde;
    }

    @Override
    public void afficherSolde() {
        System.out.println("Le montant de votre solde est : "+this.getSolde());
    }
    
}
