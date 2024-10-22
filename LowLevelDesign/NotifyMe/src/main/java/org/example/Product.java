package org.example;

import java.util.*;

public class Product implements Observable {
    private final int productId;
    private final String productName;
    private List<Observer> observerList;
    private static int id=1;
    private boolean isInStock;

    public Product(String name){
        this.productId=id++;
        this.productName=name;
        this.observerList=new ArrayList<>();
        this.isInStock=false;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerList){
            observer.update(this);
        }
    }

    public void setInStock(boolean isInStock){
        this.isInStock=isInStock;
        if(this.isInStock){
            notifyObserver();
        }
    }

    public boolean isInStock() {
        return isInStock;
    }

    public String getProductName() {
        return productName;
    }
}
