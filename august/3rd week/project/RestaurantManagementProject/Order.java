package RestaurantManagementProject;

import java.time.LocalDate;

public class Order {
    private int OrderID;
    private String menuitems;
    private int quantities;
    private double totalbillamount;
    private LocalDate date;
    private String status;
    private MenuItem menuitem;


    public MenuItem getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(MenuItem menuitem) {
        this.menuitem = menuitem;
    }

    

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getMenuitems() {
        return menuitems;
    }

    public void setMenuitems(String menuitems) {
        this.menuitems = menuitems;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    public double getTotalbillamount() {
        return totalbillamount;
    }

    public void setTotalbillamount(double totalbillamount) {
        this.totalbillamount = totalbillamount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(int orderID, String menuitems, int quantities, double totalbillamount, LocalDate date, String status,
            MenuItem m) {
        OrderID = orderID;
        this.menuitems = m.getName();
        this.quantities = quantities;
        this.totalbillamount = totalbillamount;
        this.date = date;
        this.status = status;
    }

}
