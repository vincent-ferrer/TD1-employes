package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public abstract class Commercial extends Employe {
    private double chiffreAffaire;
    private double tauxCommission;

    public Commercial(int numE, int numSecu, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double chiffreAffaire, double tauxCommission) {
        super(numE, numSecu, nom, prenom, 1, dateNaissance, dateEmbauche, base, 1);
        this.chiffreAffaire = chiffreAffaire;
        this.tauxCommission = tauxCommission;
    }

    public void negocierTransaction(){
        System.out.println("je negocie");
    }

    public double getsalaireBrut(){
        return super.getsalaireBrut()+ this.chiffreAffaire*this.tauxCommission;
    }
}
