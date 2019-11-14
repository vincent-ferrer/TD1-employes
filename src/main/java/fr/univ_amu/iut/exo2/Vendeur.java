package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Vendeur extends Commercial {
    public Vendeur(int numE, int numSecu, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double chiffreAffaire, double tauxCommission) {
        super(numE, numSecu, nom, prenom, dateNaissance, dateEmbauche, base, chiffreAffaire, tauxCommission);
    }

    public double getsalaireBrut(){
        EmployeOrdinaire vendeur= new EmployeOrdinaire(this.numE,this.numSecu,this.nom,this.prenom,this.echelon,this.dateNaissance, this.dateEmbauche,this.base,this.nbHeures);
        return vendeur.getsalaireBrut();
    }
}
