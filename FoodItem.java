/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author Acer
 */
//sub
// FoodItem.java
public class FoodItem extends MenuItem {
    private final boolean isNew = false;
    private final boolean isNewBake;

    public FoodItem(String name, double price, boolean isNewBake) {
        super(name, price);
        this.isNewBake = isNewBake;
    }

    public boolean is() {
        return isNewBake;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Is NewBake: " + isNewBake);
    }
}
