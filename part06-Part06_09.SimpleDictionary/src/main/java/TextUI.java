
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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if(command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                dictionary.add(word, translation);
                continue;
            }
            
            if(command.equals("search")) {
                System.out.print("To be translated: ");
                String toTranslate = scanner.nextLine();
                
                if(dictionary.translate(toTranslate) == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                    continue;
                }
                
                System.out.println("Translation: " + dictionary.translate(toTranslate));
                continue;
            }
            
            System.out.println("Unknown command");
            
        }
    }
    
    
}
