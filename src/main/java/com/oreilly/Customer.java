package com.oreilly;

public class Customer implements Comparable<Customer> {
    private String name;

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
