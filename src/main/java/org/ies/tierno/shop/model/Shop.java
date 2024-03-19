package org.ies.tierno.shop.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Shop {
    protected String name;

    protected Map<Integer, Product> productMap;


  protected List<Customer> customerList;

    public Shop(String name, Map<Integer, Product> productMap, List<Customer> customerList) {
        this.name = name;
        this.productMap = productMap;
        this.customerList = customerList;
    }
    public Customer returnNif(String nifClie){
        for (Customer customer: customerList){
            if (customer.getNif().equals(nifClie)){
                return customer;
            }

        }
        return  null;
    }




    public Shop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Product> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Integer, Product> productMap) {
        this.productMap = productMap;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) && Objects.equals(productMap, shop.productMap) && Objects.equals(customerList, shop.customerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productMap, customerList);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", productMap=" + productMap +
                ", customerList=" + customerList +
                '}';
    }
}
