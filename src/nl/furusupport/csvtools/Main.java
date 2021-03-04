package nl.furusupport.csvtools;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList dataStore;
    static Data dataInput;

    static String fileName;

    static CsvDataInput readerCSV;
    static CsvDataOutput writerCSV;

    public static void main(String[] args) throws IOException {

        fileName = "datalogger.csv";
        readerCSV = new CsvDataInput();
        dataStore = new ArrayList<>();

        dataStore = readerCSV.readCSV(fileName);

        System.out.println("\nData from CSV");
        for (Object dataPrinter : dataStore) {
            System.out.println(dataPrinter.toString());
        }


        System.out.println("\nData to input:");
        dataInput = new Data("Sven", "Mill", "Macmini panini maginina en dit is dus een zintest voor onze csv export.");
        dataStore.add(dataInput);
        System.out.println(dataInput + "\n");
        dataInput = new Data("Bertus", "Stavanger", "Frikandella kroketta pretta spagetta");
        dataStore.add(dataInput);
        System.out.println(dataInput + "\n");
        dataInput = new Data("Staigert", "Eindhoven", "Verfafbijter ofzo");
        dataStore.add(dataInput);
        System.out.println(dataInput + "\n");

        System.out.println("\nData from Extra Addition");
        for (Object dataPrinter : dataStore) {
            System.out.println(dataPrinter.toString());
        }

        writerCSV = new CsvDataOutput();
        writerCSV.writeCSV(fileName, dataStore);
    }
}
