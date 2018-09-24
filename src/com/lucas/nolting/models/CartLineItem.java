package com.lucas.nolting.models;

public class CartLineItem {
    private String Name;
    private double price;
    private int id,
                quantity;

    public CartLineItem(String name, double price,
                        int id, int quantity) {
        setName(name);
        setPrice(price);
        setId(id);
        setQuantity(quantity);
    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
