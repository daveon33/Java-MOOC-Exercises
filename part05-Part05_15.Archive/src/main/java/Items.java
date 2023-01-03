/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class Items {
    private String identifier;
    private String itemName;

    public Items(String identifier, String itemName) {
        this.identifier = identifier;
        this.itemName = itemName;
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Items)) {
            return false;
        }
        
        Items newItem = (Items) compared;
        
        if(this.identifier.equals(newItem.identifier)) {
            return true;
        }
        
        return false;
        
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    
}
