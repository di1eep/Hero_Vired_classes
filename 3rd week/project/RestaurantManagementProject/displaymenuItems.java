package RestaurantManagementProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


  public class displaymenuItems {
    public static void main(String[] args) {
        String csvFile = "menuitems.csv";
        ArrayList<MenuItems> people = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            boolean firstLine = true; // To skip the header
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] columns = line.split(",");
                if (columns.length == 5) {
                    String MenuID = columns[0];
                    String name = columns[1];
                    double price = Integer.parseInt(columns[2]);
                    String category = columns[3];
                    String description = columns[4];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
}
