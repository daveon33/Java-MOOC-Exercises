
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
    private JokeManager myJokes;
    private Scanner scanner;

    public UserInterface(JokeManager myJokes, Scanner scanner) {
        this.myJokes = myJokes;
        this.scanner = scanner;
    }
    
    public void start() {
        this.chooseCommand();
    }
    
    public void chooseCommand() {
        while(true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            
            if(command.equals("X")) {
                break;
            }
            
            if(command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String newJoke = scanner.nextLine();
                this.myJokes.addJoke(newJoke);
            }
            
            if(command.equals("2")) {
                System.out.println(myJokes.drawJoke());
            }
            
            if(command.equals("3")) {
                myJokes.printJokes();
            }
            
            
        }
    }
}
