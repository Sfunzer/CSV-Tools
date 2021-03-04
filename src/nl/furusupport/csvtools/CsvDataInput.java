package nl.furusupport.csvtools;

import java.io.*;
import java.util.ArrayList;

public class CsvDataInput {
    private ArrayList dataLogger;

    private String row;
    private String[] data;

    private Data dataInput;



    public CsvDataInput () {
        dataLogger = new ArrayList();
    }

    public ArrayList readCSV (String fileName) throws IOException {

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
        return dataLogger;
    }
}
