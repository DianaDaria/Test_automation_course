package com.company.topic5;

public class Pătrat extends FigurăGeometrică {

    public Pătrat(double marimeaLatureiAtribuite){
        if (marimeaLatureiAtribuite < 0 ){
            System.out.println("Marimea laturei este gresita");
        }else {
            System.out.println("Marimea laturei este mai mare decat 0");
        }
        latura = marimeaLatureiAtribuite;
    }

    private double latura;

    public double getLatura() {
        return latura;
    }

    @Override
    public double returneazaAria() {
        this.ariaFigurii = latura * latura;
        return this.ariaFigurii;
    }

    @Override
    public double returneazaPerimetrul() {
        this.perimetrulFigurii =  4 * latura;
        return this.perimetrulFigurii;
    }
}

