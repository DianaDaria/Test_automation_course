package com.company.topic5;

public class Main {
    public static void main(String[] args) {
        Cerc cercRobert = new Cerc();
        Pătrat pătratMario = new Pătrat(10.5);
        Romb rombAdam = new Romb();

        cercRobert.setRazaCercului(3.15);
        System.out.println("Aria figurii manipulate este: " + cercRobert.returneazaAria());

        double ariaPătratuluiMario = pătratMario.returneazaAria();
        System.out.println("Aria figurii manipulate este: " + pătratMario.getAriaFigurii());

        rombAdam.setDiagonale(45, 32 );
        rombAdam.returneazaAria();
        System.out.println("Aria figurii manipulate este: " + rombAdam.getAriaFigurii());
    }
}
