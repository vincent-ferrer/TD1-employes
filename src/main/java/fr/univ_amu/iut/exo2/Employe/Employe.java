package fr.univ_amu.iut.exo2.Employe;

import java.time.LocalDate;

public abstract class Employe {
    protected int numE;
    protected int numSecu;
    protected String nom;
    protected String prenom;
    protected int echelon;
    protected LocalDate dateNaissance;
    protected LocalDate dateEmbauche;

    protected double base;
    protected double nbHeures;

    public double getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
    }

    public Employe(int numE, int numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double base, double nbHeures) {
        this.numE = numE;
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    public int getNumE() {
        return numE;
    }

    public void setNumE(int numE) {
        this.numE = numE;
    }

    public int getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(int numSecu) {
        this.numSecu = numSecu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getsalaireBrut(){
        return this.base*this.nbHeures + 100;
    }

    public double getsalaireNet(){
        return 0.8*this.getsalaireBrut();
    }


    @Override
    public String toString() {
        return "Employe{" +
                "numE=" + numE +
                ", numSecu=" + numSecu +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", dateNaissance=" + dateNaissance +
                ", dateEmbauche=" + dateEmbauche +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                ", Salaire brut=" + this.getsalaireBrut() +
                ", Salaire net=" + this.getsalaireNet() +
                "} \n";
    }

}
