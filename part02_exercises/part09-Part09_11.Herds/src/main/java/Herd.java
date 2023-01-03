
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class Herd implements Movable {
    
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void move(int dx, int dy) {
        for(Movable organism: herd) {
            organism.move(dx, dy);
        }
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    public String toString() {
        
        String positions = "";
        
        for(Movable organism: herd) {
            positions += organism.toString() + "\n";
        }
        
        return positions;
    }
    
    
}
