package nl.furusupport.csvtools;

import java.io.*;
import java.util.ArrayList;
//import java.util.Arrays;

public class Main {
    static ArrayList<Data> dataLogger;
    static String row;
    static String[] data;
    static Data dataInput;

    public static void main(String[] args) throws IOException {

        dataLogger = new ArrayList<>();
        String fileName = "datalogger.csv";

        File csvFile = new File(fileName);
        if (csvFile.isFile()) {
            // create BufferedReader and read data from csv
            BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
            while ((row = csvReader.readLine()) != null) {
                data = row.split(",");

                dataInput = new Data(data[0],data[1],data[2]);
                dataLogger.add(dataInput);

            }
            csvReader.close();
        }

        System.out.println("\nData from CSV");
        for (Data dataPrinter : dataLogger) {
            System.out.println(dataPrinter.toString());
        }


        System.out.println("\nData to input:");
        dataInput = new Data("Sven", "Mill", "Macmini panini maginina en dit is dus een zintest voor onze csv export.");
        dataLogger.add(dataInput);
        System.out.println(dataInput + "\n");
        dataInput = new Data("Bertus", "Stavanger", "Frikandella kroketta pretta spagetta");
        dataLogger.add(dataInput);
        System.out.println(dataInput + "\n");
        dataInput = new Data("Staigert", "Eindhoven", "Verfafbijter ofzo");
        dataLogger.add(dataInput);
        System.out.println(dataInput + "\n");

        System.out.println("\nData from Extra Addition");
        for (Data dataPrinter : dataLogger) {
            System.out.println(dataPrinter.toString());
        }

        //String fileName = "datalogger.csv";

        FileWriter csvWriter = new FileWriter(fileName);
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Location");
        csvWriter.append(",");
        csvWriter.append("Info");
        csvWriter.append("\n");

        for (Object dataInsertert : dataLogger) {
            csvWriter.append(dataInsertert.toString());
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

    }


}
