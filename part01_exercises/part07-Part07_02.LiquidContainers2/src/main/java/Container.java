/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class Container {
    private int amountOfWater;
    
    public Container() {
        this.amountOfWater = 0;
    }
    
    public int contains() {
        return amountOfWater;
    }
    
    public void add(int amount) {
        if(amount > 0) {
            if(amountOfWater + amount > 100) {
                amountOfWater = 100;
            } else {
                amountOfWater += amount;
            }
        }
    }
    
    public void remove(int amount) {
        if(amount > 0) {
            if(amountOfWater - amount >= 0) {
                amountOfWater -= amount;
            } else {
                amountOfWater = 0;
            }
        }
    }
    
    public String toString() {
        return amountOfWater + "/100";
    }
}
