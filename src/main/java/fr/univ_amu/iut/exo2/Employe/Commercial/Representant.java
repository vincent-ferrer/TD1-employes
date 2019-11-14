package fr.univ_amu.iut.exo2.Employe.Commercial;

import fr.univ_amu.iut.exo2.Employe.EmployeOrdinaire;
import java.time.LocalDate;

public class Representant extends Commercial {

    public Representant(int numE, int numSecu, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double chiffreAffaire, double tauxCommission, double nbHeures) {
        super(numE, numSecu, nom, prenom, dateNaissance, dateEmbauche, base, chiffreAffaire, tauxCommission);
        this.nbHeures = nbHeures;
    }

    public double getsalaireBrut(){
        EmployeOrdinaire representant= new EmployeOrdinaire(this.numE,this.numSecu,this.nom,this.prenom,this.echelon,this.dateNaissance, this.dateEmbauche,this.base,this.nbHeures);
        return representant.getsalaireBrut();
    }
}
