package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Representant extends Commercial{
    public Representant(int numE, int numSecu, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double chiffreAffaire, double tauxCommission) {
        super(numE, numSecu, nom, prenom, dateNaissance, dateEmbauche, base, chiffreAffaire, tauxCommission);
    }
}
