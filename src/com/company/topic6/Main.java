package com.company.topic6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ContulPersoanei contul001 = new ContulPersoanei();
        contul001.setId(10001);
        contul001.setNumePerosana("Maia Sandu");
        contul001.setSumaCurenta(3000.25);

        System.out.println("Introduceti numarul de peroane: ");

        Scanner cititor = new Scanner(System.in);
        int numarDePersoane = cititor.nextInt();
        System.out.println("Soldul curent impartit la " + numarDePersoane + " persoane =" + contul001.imparteSoldulLaNPersoane(numarDePersoane));

        contul001.transferCatreOPersoanaAlCareiDateSuntIntrunFisierAruncare("D:\\Proiectele mele\\Test_automation_course\\src\\com\\company\\");

        contul001.transferCatreOPersoanaAlCareiDateSuntIntrunFisierTratare("D:\\\\Proiectele mele\\\\Test_automation_course\\\\src\\\\com\\\\company\\");
    }
}