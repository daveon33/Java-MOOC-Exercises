
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        if(!(dictionary.containsKey(word))) {
            ArrayList<String> newTrans = new ArrayList<>();
            newTrans.add(translation);
            dictionary.put(word, newTrans);
            return;
        }
        
        ArrayList<String> currentTranslations = dictionary.get(word);
        currentTranslations.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        if(dictionary.get(word) == null) {
            return new ArrayList<>();
        }
        
        ArrayList<String> translations = dictionary.get(word);
        return translations;
    }
    
    public void remove(String word) {
        if(dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
    }
}
