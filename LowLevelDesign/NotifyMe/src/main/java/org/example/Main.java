package org.example;

public class Main {
    public static void main(String[] args) {

        Observer customer1 = new Customer("Ashish", "ashish@gmail.com");
        Observer customer2 = new Customer("Kalp", "kalp@gmail.com");

        Product iphone = new Product("Iphone");
        Product appleWatch = new Product("Apple watch");
        iphone.addObserver(customer1);
        appleWatch.addObserver(customer2);
        iphone.setInStock(true);
        appleWatch.setInStock(true);
    }
}