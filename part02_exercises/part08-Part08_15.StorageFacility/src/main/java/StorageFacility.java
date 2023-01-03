
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;
    
    public StorageFacility() {
        this.units = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        if(!(units.containsKey(unit))) {
            ArrayList<String> items = new ArrayList<>();
            items.add(item);
            units.put(unit, items);
            return;
        }
        
        ArrayList<String> items = units.get(unit);
        items.add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if(units.get(storageUnit) == null) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
        
        return units.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        ArrayList<String> items = units.get(storageUnit);
        items.remove(item);
        units.put(storageUnit, items);
        
        if(units.get(storageUnit).isEmpty()) {
            units.remove(storageUnit);
        }

    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitNames = new ArrayList<>();
        
        for(String key: units.keySet()) {
            unitNames.add(key);
        }
        
        return unitNames;
    }
}
