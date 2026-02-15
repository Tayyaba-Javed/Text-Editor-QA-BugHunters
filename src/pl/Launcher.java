package pl;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        // Create a dummy / empty list (since we are testing startup)
        List<String> dummyResults = new ArrayList<>();
        // You can add test data if you want to see something in the table
        // dummyResults.add("Test result 1");
        // dummyResults.add("Test result 2");

        // Launch the frame with the required parameter
        SearchFrame frame = new SearchFrame(dummyResults);
        frame.setVisible(true);  // Make sure the window is shown
    }
}