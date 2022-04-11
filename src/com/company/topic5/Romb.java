package com.company.topic5;

public class Romb extends FigurăGeometrică {
    private double diagonalaMica;
    private double diagonalaMare;

    private double laturaMica;
    private double laturaMare;

    public void setDiagonale(double diagonalaMare, double diagonalaMica) {
        if ((diagonalaMare > diagonalaMica) && (diagonalaMare > 0) && (diagonalaMica > 0)) {
            this.diagonalaMare = diagonalaMare;
            this.diagonalaMica = diagonalaMica;
            System.out.println("Diagonalele au fost setate cu succes");
        } else {
            System.out.println("Ati introdus diagonalele gresit, mai incercati!");
        }
    }


    public void setDiagonalaMica(double diagonalaMica) {
        this.diagonalaMica = diagonalaMica;
    }

    public void setLaturaMica(double laturaMica) {
        this.laturaMica = laturaMica;
    }

    public void setLaturaMare(double laturaMare) {
        this.laturaMare = laturaMare;
    }

    public double getDiagonalaMare() {
        return diagonalaMare;
    }

    public double getDiagonalaMica() {
        return diagonalaMica;
    }

    public double getLaturaMare() {
        return laturaMare;
    }

    public double getLaturaMica() {
        return laturaMica;
    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = diagonalaMare * diagonalaMica / 2;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPerimetrul() {
        this.perimetrulFigurii = 2 * laturaMica * laturaMare;
        return this.perimetrulFigurii;
    }
}