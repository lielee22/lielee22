/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author Acer
 */
//Sub
// DrinkItem.java
public class DrinkItem extends MenuItem {
    private boolean isHot;
 
    
    public DrinkItem(String name, double price, boolean isHot) {
        super(name, price);
        this.isHot = isHot;
    }

    public boolean hasMilk() {
        return isHot;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("is Hot: " + isHot);
    }
}
