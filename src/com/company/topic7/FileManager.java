package com.company.topic7;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    static void scriereaInformatieiInFisier(String caleaCatreFisier, String dateSupuseScrierii) throws IOException {
        FileWriter secreteObiectDeFileWriter = new FileWriter(caleaCatreFisier);
        secreteObiectDeFileWriter.write(dateSupuseScrierii);
        secreteObiectDeFileWriter.close();
    }

    static void alipireaInformatieiLaFisier(String caleaCatreFisier, String informatie) {
        FileWriter secreteObiectDeFileWriter = null;
        try {
            secreteObiectDeFileWriter = new FileWriter(caleaCatreFisier, true);
            secreteObiectDeFileWriter.write(informatie);
            secreteObiectDeFileWriter.close();
        } catch (IOException e) {
            System.out.println("Exista o problema, dar viata continua, programul nu opreste aici! Mai incearca!");
        } finally {
            System.out.println("Acest bloc se executa mereu! Grija mare!");
        }
    }

    static String citireDateDinFisier(String caleaCatreFisier) throws IOException {
        return Files.readString(Path.of(caleaCatreFisier));
    }
}
