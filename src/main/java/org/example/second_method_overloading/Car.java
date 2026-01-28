package org.example.second_method_overloading;

public class Car {

    private String color;
    private String model;
    private double price;
    private boolean automatic;

    public Car(String color, String model, double price, boolean automatic) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.automatic = automatic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {   // himoya
            this.price = price;
        }
    }

    public boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public void showInfo() {
        System.out.println("Car information:");
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Transmission: " + (automatic ? "Automatic" : "Manual"));
        System.out.println("-----------------------");
    }
}

