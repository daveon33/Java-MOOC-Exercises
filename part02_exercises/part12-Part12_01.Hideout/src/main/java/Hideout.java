
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
public class Hideout<T> {
    
    private ArrayList<T> hideout;

    public Hideout() {
        this.hideout = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        if(this.hideout.contains(toHide)) {
            return;
        }
        
        this.hideout.clear();
        this.hideout.add(toHide);
    }
    
    public T takeFromHideout() {
        if(this.hideout.isEmpty()) {
            return null;
        }
        
        T fromHideout = this.hideout.get(0);
        this.hideout.clear();
        
        return fromHideout;
    }
    
    public boolean isInHideout() {
        if(!this.hideout.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    
}
