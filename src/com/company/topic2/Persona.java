package com.company.topic2;

public class Persona {

    public String prenumePersoana;
    protected String numePersoana;
    private int varsta;

    public void seteazaVarsta(int varstaAtribuita) {
        this.varsta = varstaAtribuita;
        System.out.println("Varsta a fost populata cu valoare urmatoare" + this.varsta);
    }

    public int getVarsta() {
        return this.varsta;
    }
}
