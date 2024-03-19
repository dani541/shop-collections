package org.ies.tierno.shop.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {

    protected int id;

    protected Date date;

    protected  double price;

    protected List<Item> itemList;

    public Order(int id, Date date, double price, List<Item> itemList) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.itemList = itemList;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Double.compare(price, order.price) == 0 && Objects.equals(date, order.date) && Objects.equals(itemList, order.itemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, price, itemList);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", price=" + price +
                ", itemList=" + itemList +
                '}';
    }
}
