package org.ies.tierno.shop.model;

import java.util.List;
import java.util.Objects;

public class Customer {
    protected String nif;

    protected String name;

    protected String surname;

    protected List<Order> orderList;


    public Customer(String nif, String name, String surname, List<Order> orderList) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.orderList = orderList;
    }

    public Customer() {
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(nif, customer.nif) && Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) && Objects.equals(orderList, customer.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, orderList);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
