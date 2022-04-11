package com.company.topic7;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String adresaFisierului = "D:\\Proiectele mele\\Test_automation_course\\src\\com\\company\\topic7\\fisierulDeLucru.txt";

        String dateDeScriere = "Test Data care se scrie in fisier";
        FileManager.scriereaInformatieiInFisier(adresaFisierului, dateDeScriere);

        String dateDeScriereDinIncercarea2 = "Alte date!";
        FileManager.scriereaInformatieiInFisier(adresaFisierului, dateDeScriereDinIncercarea2);

        FileManager.alipireaInformatieiLaFisier(adresaFisierului, "Info 1");
        FileManager.alipireaInformatieiLaFisier(adresaFisierului, "Info 2");

        String continutFisierDejaCitit = FileManager.citireDateDinFisier(adresaFisierului);
        System.out.println(continutFisierDejaCitit);

        File fisierulManipulat = new File(adresaFisierului);
        if (fisierulManipulat.exists()) {
            fisierulManipulat.delete();
        }
    }
}
