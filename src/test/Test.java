package test;

import java.io.IOException;
import com.company.sortStringsDescendingOrder;

public class Test {

    @org.junit.Test
    public void sortStringsInaFileTest() throws IOException {

        //Please give the correct location of the csv file to run the program
        sortStringsDescendingOrder sortStringsDescendingOrder = new sortStringsDescendingOrder();
        sortStringsDescendingOrder.sortStrings("input.csv", "output.csv");
    }
}
