
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
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> holding;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.holding = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(maximumWeight - suitcase.totalWeight() >= 0) {
            holding.add(suitcase);
            maximumWeight -= suitcase.totalWeight();
        }
        
    }
    
    public void printItems() {
        
        for(Suitcase hold: holding) {
                hold.printItems();
            }
        
    }
    
    public String toString() {
        int suitcasesWeight = 0;
        
        for(Suitcase suitcase: holding) {
            suitcasesWeight += suitcase.totalWeight();
        }
        
        return holding.size() + " suitcases " + "(" + suitcasesWeight + "kg)";
    }
}
