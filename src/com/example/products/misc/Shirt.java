package com.example.products.misc;


import com.example.products.Clothing;
import com.example.products.Returnable;

public class Shirt extends Clothing implements Returnable {
    int size;

    public Shirt(int id, String desc, double price, int qty, int size) {
        super(id, desc, price, qty);
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void doReturn() {
        System.out.println("Return-Policy:5 days return policy");

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Size :"+size);
    }

}