package com.company.topic1;

public class TestAngajat {

    public static void main(String[] args) {
        Angajat dianaP;
        dianaP = new Angajat("Diana Pruteanu",24);
        dianaP.seteazaSalariu(5000);
        dianaP.seteazaGen("Feminin");
        Angajat andreiS = new Angajat("Andrei Secu", 24);
        andreiS.seteazaSalariu(6000);
        andreiS.seteazaGen("Masculin");
    }
}
