package com.lucas.nolting.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable {
    private ArrayList<CartLineItem> cartLineItems = new ArrayList<>();

    public Cart() {

    }

    public Cart(CartLineItem cartLineItem) {
        addItem(cartLineItem);
    }

    public synchronized void addItem(CartLineItem cartLineItem) {

        boolean cartExists = false;

        for (CartLineItem cart : cartLineItems) {
            if (cart.getName().equals(cartLineItem.getName())) {
                int toAdd = cartLineItem.getQuantity();
                int exists = cart.getQuantity();
                cart.setQuantity(toAdd + exists);
                cartExists = true;
            }
        }

        if (!cartExists || cartLineItems.isEmpty()) {
            cartLineItems.add(cartLineItem);
        }

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

        for (CartLineItem cartLine : cartLineItems) {
            cart = cart + cartLine.getName()
                    + " " + cartLine.getPrice() + " "
                    + cartLine.getQuantity();
        }
        return cart;
    }
}
