
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
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    
    public String drawJoke() {
        if(jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        
        int randomNum = (int)Math.floor(Math.random() * (jokes.size()));
        
        return jokes.get(randomNum);
    }
    
    public void printJokes() {
        for(String joke: jokes) {
            System.out.println(joke);
        }
    }

   
    
    
}
