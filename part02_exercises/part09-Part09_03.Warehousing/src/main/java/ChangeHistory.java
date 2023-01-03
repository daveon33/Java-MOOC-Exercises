
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class ChangeHistory {
    private ArrayList<Double> productHistory;
    
    public ChangeHistory() {
        this.productHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        productHistory.add(status);
    }
    
    public void clear() {
        productHistory.clear();
    }
    
    public double maxValue() {
        if(productHistory.isEmpty()) {
            return 0;
        }
        
        double maxValue = 0; 
        
        for(Double number: productHistory) {
            if(number > maxValue) {
                maxValue = number;
            }
        }
        
        return maxValue;
    }
    
    public double minValue() {
        if(productHistory.isEmpty()) {
            return 0;
        }
        
        double minValue = 10000; 
        
        for(Double number: productHistory) {
            if(number < minValue) {
                minValue = number;
            }
        }
        
        return minValue;
    }
    
    public double average() {
        if(productHistory.isEmpty()) {
            return 0;
        }
        
        double averageSum = 0;
        
        
        for(Double number: productHistory) {
            averageSum += number;
        }
       
        return averageSum / productHistory.size();
    }
    
    public String toString() {
        return productHistory.toString();
    }
}
