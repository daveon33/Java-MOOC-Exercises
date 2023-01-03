
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class UserInterface {
    private Scanner userInput;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner userInput, ArrayList<Bird> birds) {
        this.userInput = userInput;
        this.birds = birds;
    }
    
    public void initialize() {
        showUI();
    }
    
    public void showUI() {
        while(true) {
            System.out.print("? ");
            String command = userInput.nextLine();
            
            if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = userInput.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = userInput.nextLine();
                birds.add(new Bird(name, nameInLatin));
            }
            
            if(command.equals("Observation")) {
                System.out.println("Bird? ");
                String birdWitnessed = userInput.nextLine();
                
                for(Bird bird: birds) {
                    if(bird.getName().equals(birdWitnessed)) {
                        bird.setNumberOfObservations();
                        continue;
                    }
                    
                    System.out.println("Not a bird!");
                }
            }
            
            if(command.equals("All")) {
                if(birds.isEmpty()) {
                    continue;
                }
                
                printBirds();
            }
            
            if(command.equals("One")) {
                System.out.print("Bird? ");
                String nameBird = userInput.nextLine();
                
                for(Bird bird: birds) {
                    if(bird.getName().equals(nameBird)) {
                        System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getNumberOfObservations() + " observations");
                    }
                }
                
            }
            
            if(command.equals("Quit")) {
                break;
            }
            
        }
    }
    
    public void printBirds() {
       
        for(Bird bird: birds) {
            System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getNumberOfObservations() + " observations");
        }
    }
}
