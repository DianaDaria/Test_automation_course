package com.company.topic5;

public abstract class FigurăGeometrică {


    protected double ariaFigurii;
    protected double perimetrulFigurii;

    public abstract double returneazaAria();

    public abstract double returneazaPerimetrul();

    public double getAriaFigurii() {
        return ariaFigurii;
    }

    public double getPerimetrulFigurii() {
        return perimetrulFigurii;
    }
}