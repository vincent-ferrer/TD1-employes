package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class EmployeOrdinaire extends Employe {

    public EmployeOrdinaire(int numE, int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures) {
        super(numE, numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, base, nbHeures);
    }

    public void effectuerTacheOrdinaire(){
        System.out.println("je suis fonctionnaire");
    }

    public double getsalaireBrut(){
        return super.getsalaireBrut() + this.echelon*100;
    }
}
