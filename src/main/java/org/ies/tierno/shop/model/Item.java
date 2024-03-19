package org.ies.tierno.shop.model;

import java.util.Objects;

public class Item {

    protected int product;

    protected double amount;


    public Item(int product, double amount) {
        this.product = product;
        this.amount = amount;
    }

    public Item() {
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return product == item.product && Double.compare(amount, item.amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, amount);
    }

    @Override
    public String toString() {
        return "Item{" +
                "product=" + product +
                ", amount=" + amount +
                '}';
    }
}
