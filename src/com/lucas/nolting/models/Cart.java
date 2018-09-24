package com.lucas.nolting.models;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartLineItem> cartLineItems = new ArrayList<>();

    public Cart(CartLineItem cartLineItem) {
        addItem(cartLineItem);
    }

    public void addItem(CartLineItem cartLineItem) {
        cartLineItems.add(cartLineItem);
    }

    public void deleteItemAt(int index) {
        cartLineItems.remove(index);
    }

    public void clearCart() {
        cartLineItems.clear();
    }

    public CartLineItem getItemAt(int index) {
        return cartLineItems.get(index);
    }

    public String displayCart() {
        String cart = "";

        for(CartLineItem cartLine: cartLineItems) {
            cart = cart + cartLine.getName()
                    + " " + cartLine.getPrice() + " "
                    + cartLine.getQuantity();
        }
        return cart;
    }
}
