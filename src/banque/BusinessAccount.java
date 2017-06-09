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
public class BusinessAccount extends Account {
    
    public double decouvertAutorise;

    public BusinessAccount(int numero, double solde, String nom, String prenom, double dec) {
        super(numero, solde, nom, prenom);
        this.decouvertAutorise = dec;
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
        System.out.println("Le montant de votre solde est : "+this.getSolde()+" le decouvert s'eleve à :"+this.decouvertAutorise);
    }
    
    @Override
    public void retrait(double sommeRetrait) {
       if(solde >= sommeRetrait)
        {
            solde -= sommeRetrait;
            System.out.println("Nom :"+nom);
            System.out.println("Prenom :"+prenom);
            System.out.println("Numero :"+numero);
            System.out.println("Montant retiré :"+sommeRetrait);
            System.out.println("Decouvert restant :"+decouvertAutorise);
            System.out.println("Nouveau solde :"+solde);
        }
        else if(decouvertAutorise >= sommeRetrait)
        {
            decouvertAutorise -= sommeRetrait;
            System.out.println("Nom :"+nom);
            System.out.println("Prenom :"+prenom);
            System.out.println("Numero :"+numero);
            System.out.println("Montant retiré :"+sommeRetrait);
            System.out.println("Decouvert restant :"+decouvertAutorise);
            System.out.println("Nouveau solde :"+solde);
        }
        else if((solde+decouvertAutorise)>=sommeRetrait)
        {
            double somTotal = solde+decouvertAutorise;
            decouvertAutorise = somTotal - sommeRetrait;
            solde = 0;
            System.out.println("Nom :"+nom);
            System.out.println("Prenom :"+prenom);
            System.out.println("Numero :"+numero);
            System.out.println("Montant retiré :"+sommeRetrait);
            System.out.println("Decouvert restant :"+decouvertAutorise);
            System.out.println("Nouveau solde :"+solde);
        }
        else
        {
            System.out.println("Solde insuffisant pour effectuer cette operation!!!");
        }
    }
    
}
