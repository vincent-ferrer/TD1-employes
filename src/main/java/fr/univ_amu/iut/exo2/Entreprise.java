package fr.univ_amu.iut.exo2;

import java.util.Arrays;

public class Entreprise {
    private String nom;
    private Employe[] listeEmploye;

    public Entreprise(String nom, Employe[] listeEmploye) {
        this.nom = nom;
        this.listeEmploye = listeEmploye;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nom='" + nom + '\'' +
                ", listeEmploye= \n " + Arrays.toString(listeEmploye) +
                '}';
    }

    /* getBase setBase */
}
