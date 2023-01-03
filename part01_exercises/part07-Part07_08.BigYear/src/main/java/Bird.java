/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class Bird {
    private String name;
    private String latinName;
    private int numberOfObservations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.numberOfObservations = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getNumberOfObservations() {
        return numberOfObservations;
    }

    public void setNumberOfObservations() {
        this.numberOfObservations += 1;
    }
    
    
    
    
}
