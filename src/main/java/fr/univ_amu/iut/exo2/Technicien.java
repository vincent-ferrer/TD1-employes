package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Technicien extends Employe{
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Technicien(int numE, int numSecu, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite) {
        super(numE, numSecu, nom, prenom, 0, dateNaissance, dateEmbauche, base, nbHeures);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    public void fabriquerProduit(){
        System.out.println("je suis un petit chinois");
    }

    public double getsalaireBrut(){
        return super.getsalaireBrut() + nbUnitesProduites*tauxCommissionUnite;
    }

}
