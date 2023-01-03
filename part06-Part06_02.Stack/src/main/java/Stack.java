
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
public class Stack {
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(stack.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    public void add(String value) {
        stack.add(value);
    }
    
    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList<>();
        
        for(int i = 0; i < stack.size(); i++) {
            values.add(stack.get(i));
        }
        
        return values;
    }
    
    public String take() {
        String lastValue = stack.get(stack.size() - 1);
        stack.remove(lastValue);
        
        return lastValue;
        
    }
}
