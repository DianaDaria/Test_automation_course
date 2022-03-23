package com.company.topic4;

public class Persoana {
    public Persoana (String numeAtribuit, int varstaPersoana){
        nume = numeAtribuit;
        varsta = varstaPersoana;
    }

    String nume;
    int varsta;

    public void afiseazaCategoriaDeVarsta(){
        if (varsta < 12){
            System.out.println("Persoana este copil");
        }else if (varsta <18){
            System.out.println("Persoana este adolescent");
        }else if (varsta < 27){
            System.out.println("Persoana este tanara");
        }else if (varsta < 64){
            System.out.println("Persoana este matura");
        }else {
            System.out.println("Persoana este varstnica");
        }
    }
}
