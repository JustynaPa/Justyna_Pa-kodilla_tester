package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order ("a/123"));
        warehouse.addOrder(new Order ("b/123"));
        warehouse.addOrder(new Order ("c/123"));

        try {
            warehouse.getOrder("d/123");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, the system doesn't recognize this order number.");
        } finally {
            System.out.println("Thank you for choosing our services.");
        }

    }
}
