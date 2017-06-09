/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

import java.util.Scanner;

/**
 *
 * @author Lamine Dieng
 */
public class TestAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration de tableau pour chaque type de compte
        CheckingAccount [] comptesCourant;
        SavingAccount [] comptesEpargne;
        BusinessAccount [] comptesPro;

        //Instantiation et initialisation des tableaux
        comptesCourant = new CheckingAccount []
        {
            new CheckingAccount(1, 25000.0, "Cheikh", "Gueye"),
            new CheckingAccount(2, 50000.0, "Issa", "Ba"),
            new CheckingAccount(2, 75000.0, "Alimatou", "Diaho")
        };
        
        comptesEpargne = new SavingAccount []
        {
            new SavingAccount(1, 25000.0, "Astou", "Laye"),
            new SavingAccount(2, 50000.0, "Mamadou", "Sow"),
            new SavingAccount(2, 75000.0, "Aliou", "Thiema")
        };
        
        comptesPro = new BusinessAccount[]
        {
            new BusinessAccount(1, 50000.0, "Mostapha", "Badji", 5000.0),
            new BusinessAccount(2, 85000.0, "Aladji", "Dia", 15000.0),
            new BusinessAccount(3, 100000.0, "Abdou", "Dramé", 25000.0)
        };
        
        //Instantiation de la classe Scanner pour recuperer les entrées
        Scanner scan = new Scanner(System.in);
        
        //Declaration d'un booleen pour l'arret de l'execution
        Boolean exec = true;
        
        //variable recuperant le choix de l'utilisateur
        int choix = 0;
        
        while(exec || choix==0)
        {
            //Affichage du menu tant que exec est vrai
        System.out.println("--Choisissez votre type de compte--");
	System.out.println("Compte Courant : 1");
	System.out.println("Compte Epargne : 2");
	System.out.println("Compte business : 3");
        //System.out.println("Precedent : 0");
        System.out.println("Quitter : 9");
        
        
	choix = scan.nextInt();
        
        //Action selon le choix de l'utilisateur
	switch(choix)
	{
		case 1 :{
                        System.out.println("---Choisissez l'operation à effectuer dans votre compte courant---");
                        System.out.println("Depot : 1");
                        System.out.println("Retrait : 2");
                        System.out.println("Consultation de solde : 3");
                        System.out.println("Precedent : 0");
                        System.out.println("Quitter : 9");
                        int choixCourant = scan.nextInt();
                        switch(choixCourant){
                                case 1 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesCourant.length; i++)
                                    {
                                        if(comptesCourant[i].numero==num)
                                        {
                                            CheckingAccount ca = new CheckingAccount(comptesCourant[i].numero, comptesCourant[i].solde, comptesCourant[i].nom, comptesCourant[i].prenom);
                                            System.out.println("Quel montant desirez-vous deposer dans votre compte?");
                                            double mnt = scan.nextDouble();
                                            ca.depot(mnt);
                                        }
                                    }
                                }
                                break;
                                case 2 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesCourant.length; i++)
                                    {
                                        if(comptesCourant[i].numero==num)
                                        {
                                            CheckingAccount ca = new CheckingAccount(comptesCourant[i].numero, comptesCourant[i].solde, comptesCourant[i].nom, comptesCourant[i].prenom);
                                            System.out.println("Quel montant desirez-vous retirer dans votre compte?");
                                            double mnt = scan.nextDouble();
                                            ca.retrait(mnt);
                                        }
                                    }
                                }
                                break;
                                case 3 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesCourant.length; i++)
                                    {
                                        if(comptesCourant[i].numero==num)
                                        {
                                            comptesCourant[i].afficherSolde();
                                        }
                                    }
                                }
                                break;
                                case 9 : exec = false; break;
                                default : System.out.println("entrez un choix entre 1 et 3"); break;
                                }
                        } break;
        case 2 : {  
                        System.out.println("---Choisissez l'operation à effectuer dans votre compte epargne---");
                        System.out.println("Depot : 1");
                        System.out.println("Retrait : 2");
                        System.out.println("Virement : 3");
                        System.out.println("Consultation de solde : 4");
                        System.out.println("quitter : 9");
                        int choixEpargne = scan.nextInt();
                        switch(choixEpargne){
                                case 1 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesEpargne.length; i++)
                                    {
                                        if(comptesEpargne[i].numero==num)
                                        {
                                            SavingAccount sa = new SavingAccount(comptesCourant[i].numero, comptesCourant[i].solde, comptesCourant[i].nom, comptesCourant[i].prenom);
                                            System.out.println("Quel montant desirez-vous deposer dans votre compte?");
                                            double mnt = scan.nextDouble();
                                            sa.depot(mnt);
                                        }
                                    }
                                }
                                break;
                                case 2 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesEpargne.length; i++)
                                    {
                                        if(comptesEpargne[i].numero==num)
                                        {
                                            SavingAccount ca = new SavingAccount(comptesEpargne[i].numero, comptesEpargne[i].solde, comptesEpargne[i].nom, comptesEpargne[i].prenom);
                                            System.out.println("Quel montant desirez-vous retirer dans votre compte?");
                                            double mnt = scan.nextDouble();
                                            ca.retrait(mnt);
                                        }
                                    }
                                }
                                break;
                                case 3 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesEpargne.length; i++)
                                    {
                                        if(comptesEpargne[i].numero==num)
                                        {
                                            SavingAccount sa = new SavingAccount(comptesEpargne[i].numero, comptesEpargne[i].solde, comptesEpargne[i].nom, comptesEpargne[i].prenom);
                                            System.out.println("Entrer le numero de compte dans lequel vous voulez faire un virement: ");
                                            int numVir = scan.nextInt();
                                            for(int j = 0; j<comptesEpargne.length; j++)
                                            {
                                                if(comptesEpargne[j].numero==numVir)
                                                {
                                                    SavingAccount sa2 = new SavingAccount(comptesEpargne[j].numero, comptesEpargne[j].solde, comptesEpargne[j].nom, comptesEpargne[j].prenom);
                                                    System.out.println("Quel montant desirez-vous virer dans le compte numero : "+numVir);
                                                    double mnt = scan.nextDouble();
                                                    sa.virement(sa2, mnt);
                                                    sa.afficherSolde();
                                                }
                                                }
                                            
                                        }
                                    }
                                }
                                break;
                                case 4 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesCourant.length; i++)
                                    {
                                        if(comptesEpargne[i].numero==num)
                                        {
                                            comptesEpargne[i].afficherSolde();
                                        }
                                    }
                                }
                                break;
                                case 9 : exec = false; break;
                                default : System.out.println("entrez un choix entre 1 et 4"); break;
                                }
                        } break;
        case 3 : {
                        System.out.println("---Choisissez l'operation à effectuer dans votre compte business---");
                        System.out.println("Depot : 1");
                        System.out.println("Retrait : 2");
                        System.out.println("Consultation de solde : 3");
                        System.out.println("quitter : 9");
                        int choixBusiness = scan.nextInt();
                        switch(choixBusiness){
                                case 1 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesPro.length; i++)
                                    {
                                        if(comptesPro[i].numero==num)
                                        {
                                            BusinessAccount ba = new BusinessAccount(comptesPro[i].numero, comptesPro[i].solde, comptesPro[i].nom, comptesPro[i].prenom, comptesPro[i].decouvertAutorise);
                                            System.out.println("Quel montant desirez-vous deposer dans votre compte?");
                                            double mnt = scan.nextDouble();
                                            ba.depot(mnt);
                                        }
                                    }
                                }
                                break;
                                case 2 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                            for (BusinessAccount comptesPro1 : comptesPro) {
                                if (comptesPro1.numero == num) {
                                    BusinessAccount ba = new BusinessAccount(comptesPro1.numero, comptesPro1.solde, comptesPro1.nom, comptesPro1.prenom, comptesPro1.decouvertAutorise);
                                    System.out.println("Quel montant desirez-vous retirer dans votre compte?");
                                    double mnt = scan.nextDouble();
                                    ba.retrait(mnt);
                                }
                            }
                                }
                                break;
                                case 3 : {
                                    System.out.println("Quel est votre numero de compte?");
                                    int num = scan.nextInt();
                                    for(int i = 0; i<comptesPro.length; i++)
                                    {
                                        if(comptesPro[i].numero==num)
                                        {
                                            comptesPro[i].afficherSolde();
                                        }
                                    }
                                }
                                break;
                                case 9 : exec = false; break;
                                default : System.out.println("entrez un choix entre 1 et 3"); break;
                                }
                        } break;
        case 9 : exec = false; break;
        default : System.out.println("entrez un choix entre 1 et 3"); break;
	}
        }
    }
    
}
