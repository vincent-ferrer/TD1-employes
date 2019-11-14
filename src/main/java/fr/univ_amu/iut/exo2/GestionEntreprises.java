package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo2.Employe.*;
import fr.univ_amu.iut.exo2.Employe.Commercial.Representant;
import fr.univ_amu.iut.exo2.Employe.Commercial.Vendeur;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Representant e1 = new Representant(1, 1, "Ferrer", "Vincent", LocalDate.of(1999, Month.JUNE, 3), LocalDate.of(2019, Month.OCTOBER, 5), 10, 100, 35, 35);
        Vendeur e11 = new Vendeur(1, 1, "Ferrer", "Josselin", LocalDate.of(1995, Month.AUGUST, 8), LocalDate.of(2019, Month.OCTOBER, 5), 10, 100, 35);
        EmployeOrdinaire e2 = new EmployeOrdinaire(2, 2, "Cassina", "Robin", 1, LocalDate.of(1999, Month.JUNE, 3), LocalDate.of(2019, Month.OCTOBER, 5), 10, 35);
        Technicien e3 = new Technicien(3, 3, "Caouini", "Youssef", LocalDate.of(1999, Month.JUNE, 3), LocalDate.of(2019, Month.OCTOBER, 5), 10, 35, 100, 35);
        Employe listeEmploye[] = {e1, e11, e2, e3};
        Entreprise maBoiteInfo = new Entreprise("maBoiteInfo", listeEmploye);
        System.out.println(maBoiteInfo.toString());
    }
}