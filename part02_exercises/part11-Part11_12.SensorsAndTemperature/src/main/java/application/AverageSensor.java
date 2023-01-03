/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daveon
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> reading;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.reading = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() throws Exception {
        return reading;
    }
    
    @Override
    public boolean isOn() {
        for(Sensor s: sensors) {
            if(s.isOn() == false) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void setOn() {
        for(Sensor s: sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor s: sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() throws Exception {
        int average = 0;
        
        if(this.isOn() && !this.sensors.isEmpty()) {
            for(Sensor s: sensors) {
                int currentReading = s.read();
                average += currentReading;
            }
            
            this.reading.add(average / this.sensors.size() );
            
            return average / this.sensors.size();
        }
        
        throw new IllegalStateException("Wrong");
    }
    
    
}
