package fr.univ_amu.iut.exo2.Employe.Commercial;

import java.time.LocalDate;

public class Vendeur extends Commercial {
    public Vendeur(int numE, int numSecu, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double chiffreAffaire, double tauxCommission) {
        super(numE, numSecu, nom, prenom, dateNaissance, dateEmbauche, base, chiffreAffaire, tauxCommission);
    }
}
