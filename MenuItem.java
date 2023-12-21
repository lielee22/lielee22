/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author Acer
 */
// MenuItem.java
//Superclass
public class MenuItem {
    private String name;
    private double price;

    Utilities utilities = new Utilities();
    
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
