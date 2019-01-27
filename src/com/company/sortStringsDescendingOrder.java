package com.company;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class sortStringsDescendingOrder {

    String[] stringSplited;
    BufferedReader bufferedReader;

    public void sortStrings(String inputFile, String outPutFile) throws IOException {

        String stringsTobeStorted;
        bufferedReader = new BufferedReader(new FileReader(inputFile));
        Map<String, String> fileContent = new TreeMap<>();

        while ((stringsTobeStorted = bufferedReader.readLine()) != null) {

            fileContent.put("line1", stringsTobeStorted);
            stringSplited = stringsTobeStorted.split(",");
            Arrays.sort(stringSplited, Collections.reverseOrder());
            for (int i = 0; i < stringSplited.length; i++)
                System.out.println("Sorted String: " + stringSplited[i]);
        }

        FileWriter writer = new FileWriter(outPutFile);
        for (String val : stringSplited) {
            writer.write(val);
            writer.append(",");

        }
        bufferedReader.close();
        writer.close();
    }


    //I ignored /n character in the input csv file. Read the question pls.
    //In the output I am getting one extra ,
    //how will the path work in there system? (input and output File)
    //Folder structure


    @Test
    public void sortStringsInaFileTest() throws IOException {

        sortStrings("input.csv", "/Users/pboopathi/Documents/backup-mac/gitrepo/TestProject/out/Files/output.csv");
    }
}
