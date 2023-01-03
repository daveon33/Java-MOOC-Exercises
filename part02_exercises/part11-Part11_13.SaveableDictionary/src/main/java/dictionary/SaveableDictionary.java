/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author daveon
 */
public class SaveableDictionary {
    
    private HashMap<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public boolean load() {
        
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file));
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                
                add(parts[0], parts[1]);
            }
            
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }
    
    public void add(String words, String translation) {
        if(this.dictionary.containsKey(words) || this.dictionary.containsValue(translation)) {
            return;
        }
        
        this.dictionary.put(words, translation);
    }
    
    public String translate(String word) {
        if(this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        
        if(this.dictionary.containsValue(word)) {
            for(String k: this.dictionary.keySet()) {
                if(this.dictionary.get(k).equals(word)) {
                    return k;
                }
            }
        }
        
        return null;
    }
    
    public void delete(String word) {
        if(this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
        
        Set entrySet = this.dictionary.entrySet();
        Iterator it = entrySet.iterator();
        
        while(it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            
            if(me.getKey().equals(word) || me.getValue().equals(word)) {
                it.remove();
            }
        }
        
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            Set entrySet = this.dictionary.entrySet();
            Iterator it = entrySet.iterator();
            
            while(it.hasNext()) {
                Map.Entry me = (Map.Entry)it.next();
                
                writer.println(me.getKey() + ":" + me.getValue());
            }
            
            writer.close();
           
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
}
