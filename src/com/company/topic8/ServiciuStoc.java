package com.company.topic8;

public class ServiciuStoc {
    public static void main(String[] args) {
        Carte secreteleSuccesului = new Carte("Secretele succesului", "Dale Carnegie", 2022, 291);
        Carte tataBogatTataSarac = new Carte("Tata bogat / Tata sarac", "Robert Kiyosaki", 1509, 232);
        Carte rework = new Carte("Rework", "David Heinemeier Hansson, Jason Fried", 0505, 272);
        Carte miliardariInBitcoin = new Carte("Miliardari in bitcoin", "Ben Mezrich", 1112, 320);
        Carte fenomenulGoogle = new Carte("Fenomenul Google", "John Battelle", 2106, 442);

        Stoc magazinulDeLaBucurObor = new Stoc(1, "str. Ziduri Mosi 23");
        Stoc magazinulDePiataUniversitatii = new Stoc(2, "str. Lipscani 55");

        magazinulDeLaBucurObor.adaugaCarteInStoc(secreteleSuccesului);
        magazinulDeLaBucurObor.adaugaCarteInStoc(tataBogatTataSarac);
        magazinulDeLaBucurObor.adaugaCarteInStoc(rework);

        System.out.println("Carti in magazinul de la Bucur Obor sunt:" + magazinulDeLaBucurObor.numarDeCartiDinStoculCurent());

        magazinulDeLaBucurObor.stergeCarteaDinStoc(secreteleSuccesului);
        System.out.println("Carti in magazinul de la Bucur Obor sunt:" + magazinulDeLaBucurObor.numarDeCartiDinStoculCurent());

        magazinulDeLaBucurObor.afiseazaCartileDinStoc();

        System.out.println(magazinulDeLaBucurObor.esteStoculGol());
        System.out.println(magazinulDeLaBucurObor.existaCarteaInAcesStoc(secreteleSuccesului));
        System.out.println(magazinulDeLaBucurObor.existaCarteaInAcesStoc(tataBogatTataSarac));
    }
}