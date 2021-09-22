package com.digitalleague.taxiservice.Entity;

import java.util.Objects;

public class Orders {
    private String name;

    public Orders(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return Objects.equals(name, orders.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
