
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(registry.containsKey(licensePlate)) {
            return false;
        }
        
        registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return registry.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates() {
        for(LicensePlate key: registry.keySet()) {
            System.out.println(key.toString());
        }
    }
    
    public void printOwners() {
        ArrayList<String> alreadyAnOwner = new ArrayList<>();
        
        for(String value: registry.values()) {
            if(!(alreadyAnOwner.contains(value))) {
                System.out.println(value);
                alreadyAnOwner.add(value);
            }
        }
    }
}
