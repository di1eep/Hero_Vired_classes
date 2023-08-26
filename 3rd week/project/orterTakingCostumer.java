import java.io.*;
import java.util.*;

class MenuItem {

    int OrderID;     // objects
    String name;
    double price;
    String category;
    String description;

    public MenuItem(int orderID, String name, double price, String category, String description) {      // methods
        this.MenuID = MenuID;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
}

class CustomerOrder {
    int MenuID;
    List<MenuItem> menuItems;
    double totalBillAmount;
    Date orderDate;
    String status;

    public CustomerOrder(int orderID) {
        this.MenuID = MenuID;
        menuItems = new ArrayList<>();
        totalBillAmount = 0.0;
        orderDate = new Date(16); // Current date
        status = "Pending"; // Default status
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        totalBillAmount += item.price;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + MenuID);
        System.out.println("Menu Items and Quantities:");
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.name);
        }
        System.out.println("Total Bill Amount: $" + totalBillAmount);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + status);
    }
}

public class orterTakingCostumer {
    public static void main(String[] args) {
        String csvFilePath = "menuitem.csv"; 
        List<MenuItem> menuItems = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int MenuID = Integer.parseInt(data[0]);
                String name = data[1];
                double price = Double.parseDouble(data[2]);
                String category = data[3];
                String description = data[4];

                menuItems.add(new MenuItem(MenuID, name, price, category, description));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        int inputOrderID = scanner.nextInt();

        CustomerOrder customerOrder = new CustomerOrder(inputMenuID);
        for (MenuItem menuItem : menuItems) {
            if (menuItem.MenuID == inputMenuID) {
                customerOrder.addMenuItem(menuItem);
            }
        }

        scanner.close();

        System.out.println();
        customerOrder.showOrderDetails();
    }
}
