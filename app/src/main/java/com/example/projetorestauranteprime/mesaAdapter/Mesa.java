package com.example.projetorestauranteprime.mesaAdapter;

public class Mesa {

    private int id;
    private int people;
    private int ordersPlaced;
    private int readyOrders;

    public Mesa(int id, int people, int ordersPlaced, int readyOrders) {
        this.id = id;
        this.people = people;
        this.ordersPlaced = ordersPlaced;
        this.readyOrders = readyOrders;
    }

    public int getId() {
        return id;
    }

    public int getPeople() {
        return people;
    }

    public int getOrdersPlaced() {
        return ordersPlaced;
    }

    public int getReadyOrders() {
        return readyOrders;
    }
}
