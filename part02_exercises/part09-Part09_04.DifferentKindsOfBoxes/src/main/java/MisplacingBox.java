
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
public class MisplacingBox extends Box {
    private ArrayList<Item> misBox;
    
    public MisplacingBox() {
        this.misBox = new ArrayList<>();
    }
    
    public void add(Item item) {
        misBox.add(item);
    }
    
    public boolean isInBox(Item item) {
        return false;
    }
}
