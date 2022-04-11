package com.company.topic8;

public class Carte {
    public Carte(String titluAtribuit, String autorTitlu, long numarDeSerieAtribuit, int paginiAtribuite) {

        titlu = titluAtribuit;
        autor = autorTitlu;
        numarDeSerie = numarDeSerieAtribuit;
        pagini = paginiAtribuite;
    }

    private String titlu;
    private String autor;
    private long numarDeSerie;
    private int pagini;

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", numarDeSerie=" + numarDeSerie +
                '}';
    }
}