
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
public class Package {
    private ArrayList<Gift> packageWithGifts;
    
    public Package() {
        this.packageWithGifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        packageWithGifts.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for(Gift gift: packageWithGifts) {
            totalWeight += gift.getWeight();
        }
        
        return totalWeight;
    }
}
