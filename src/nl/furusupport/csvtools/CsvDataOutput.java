package nl.furusupport.csvtools;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvDataOutput {


    public CsvDataOutput (){

    }
    public void writeCSV (String fileName, ArrayList dataStore) throws IOException {

        FileWriter csvWriter = new FileWriter(fileName);
        csvWriter.append("Name");
        csvWriter.append(",");
        csvWriter.append("Location");
        csvWriter.append(",");
        csvWriter.append("Info");
        csvWriter.append("\n");

        for (Object dataInsertert : dataStore) {
            csvWriter.append(dataInsertert.toString());
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

    }
}
