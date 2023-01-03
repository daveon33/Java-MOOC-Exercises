/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author daveon
 */
public class TemperatureSensor implements Sensor {
    
    private boolean sensorState;
   
    public TemperatureSensor() {
        this.sensorState = false;
    }

    @Override
    public boolean isOn() {
        return this.sensorState;
    }

    @Override
    public void setOn() {
        this.sensorState = true;
    }

    @Override
    public void setOff() {
        this.sensorState = false;
    }

    @Override
    public int read() throws Exception {
        if(this.sensorState == true) {
            Random rand = new Random();
            int someNum = rand.nextInt(30 + 30) - 30;
            
            return someNum;
        }
        
        throw new IllegalStateException("Wrong");
    }
    
}
