
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
public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public boolean isEmpty() {
        if(people.isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if(this.isEmpty()) {
            return null;
        }
        
        Person shortKing = people.get(0);
        
        for(Person possibleShortKing: people) {
            if(possibleShortKing.getHeight() < shortKing.getHeight()) {
                shortKing = possibleShortKing;
            }
        }
        
        return shortKing;
    }
    
    public Person take() {
        if(this.isEmpty()) {
            return null;
        }
        
        Person theShortKing = this.shortest();
        people.remove(theShortKing);
        
        return theShortKing;
    }
}
