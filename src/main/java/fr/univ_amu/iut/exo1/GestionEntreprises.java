package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises {
    public static void main(String[] args) {
        Employe e1 = new Employe(1, 1, "Ferrer", "Vincent", 1, LocalDate.of(1999, Month.JUNE, 3), LocalDate.of(2019, Month.OCTOBER, 5), 100, 35);
        Employe e2 = new Employe(1, 1, "Cassina", "Robin", 1, LocalDate.of(1999, Month.JUNE, 3), LocalDate.of(2019, Month.OCTOBER, 5), 10, 35);
        Employe listeEmploye[] = {e1, e2};
        Entreprise maBoiteInfo = new Entreprise("maBoiteInfo", listeEmploye);
        System.out.println(maBoiteInfo.toString());
    }
}