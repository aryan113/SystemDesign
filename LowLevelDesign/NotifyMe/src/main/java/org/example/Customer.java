package org.example;

public class Customer implements Observer {

    private final String name;
    private final String email;


    public Customer(String name, String email) {
        this.name=name;
        this.email=email;

    }

    @Override
    public void update(Product product) {
        System.out.println("Dear "+ name + " the product "+ product.getProductName()+ " is available now.");
        sendNotification(product);
    }

    public void sendNotification(Product product) {
        System.out.println("Notification sent to "+ email + " for product: " + product.getProductName());
    }
}
