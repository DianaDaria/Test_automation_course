package com.company.topic1;

public class Angajat {
    public Angajat(String numeAtribuit, int virstaAtribuita) {
        nume = numeAtribuit;
        virsta = virstaAtribuita;
    }


    String nume;
    int virsta;
    double salariu;
    String gen;

    void seteazaSalariu(double salariuAtribuit) {
        salariu = salariuAtribuit;
        System.out.println(nume + " are urmatorul salariu " + salariu);

    }

    void seteazaGen(String genAtribuit) {
        gen = genAtribuit;
        System.out.println(nume + " are urmatorul gen " + gen);
    }
}
