package com.company.topic6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ContulPersoanei {

    private String numePerosana;
    private int id;
    private double sumaCurenta;

    public void setNumePerosana(String numePerosana) {
        this.numePerosana = numePerosana;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumaCurenta(double sumaCurenta) {
        if (sumaCurenta > 0) {
            this.sumaCurenta = sumaCurenta;
        } else System.out.println("Soldul nu poate fi negativ!");
    }

    public String getNumePerosana() {
        return this.numePerosana;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    public int getId() {
        return id;
    }

    public double sustragereDeBani(double sumaExtrasa) {
        if (sumaExtrasa > sumaCurenta) {
            System.out.println("Soldul mijloacelor banesti este insuficient!");
        }
        return (sumaCurenta - sumaExtrasa);
    }

    public int imparteSoldulLaNPersoane(int numarDePersoane) {
        int result = 0;
        try {
            result = (int) sumaCurenta / numarDePersoane;
        } catch (ArithmeticException exceptieObiect) {
            System.out.println("Ai introdus valoarea 0, respectiv returnam 0");
        }
        return result;
    }

    public void transferCatreOPersoanaAlCareiDateSuntIntrunFisierAruncare(String directoriuCuFisierulDat) throws FileNotFoundException {
        File datelePentruTransfer001 = new File(directoriuCuFisierulDat);
        FileReader fileReader001 = new FileReader(datelePentruTransfer001);
    }

    public void transferCatreOPersoanaAlCareiDateSuntIntrunFisierTratare(String directoriuCuFisierulDat) {
        File datelePentruTransfer001 = new File(directoriuCuFisierulDat);
        try {
            FileReader fileReader001 = new FileReader(datelePentruTransfer001);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Please review the entered data");
        } finally {
            System.out.println("Acest cod este rulat indiferent de ce se intampla mai sus");
        }
    }
}