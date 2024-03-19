package org.ies.tierno.shop.model;

import java.util.Objects;
import java.util.Set;

public class Product {

    protected int id;
    protected String name;

    protected double price;

    protected Set<String> tags;

    public Product(int id, String name, double price, Set<String> tags) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(tags, product.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, tags);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tags=" + tags +
                '}';
    }
}
