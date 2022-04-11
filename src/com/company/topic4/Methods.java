package com.company.topic4;

public class Methods {
    static int sum(int primulNumar, int alDoileaNumar) {

        int suma = 0;

        if (primulNumar > alDoileaNumar) {
            System.out.println("Nu putem calcula suma acestui interval gresit");
            return suma;

        } else if (primulNumar == alDoileaNumar) {
            System.out.println("Primul numar este identic cu al doilea");
            return primulNumar;

        } else {
            for (int i = primulNumar; i <= alDoileaNumar; i++) {
                suma = suma + i;
            }

            System.out.println("Executia ciclului FOR s-a finisat");
        }
        System.out.println("Metoda s-a executat pana la capat");
        return suma;
    }

    static void sum(double a) {
        double suma = 0;
        if (a > 0) {
            while (a > 0) {
                suma += a;
                a--;
            }
            System.out.println("S-a terminat executia WHILE");
            System.out.println(suma);

        } else if (a == 0) {
            System.out.println("suma e 0");

        } else {
            System.out.println("a este mai mic ca 0");
        }
    }


    static double sum(float a) {
        double suma = 0;
        if (a > 0) {
            while (a > 0) {
                suma += a;
                a--;
            }
            System.out.println("S-a terminat executia WHILE");
            System.out.println(suma);
        } else if (a == 0) {
            System.out.println("suma e 0");

        } else {
            System.out.println("a este mai mic ca 0");
        }
        return suma;
    }
}