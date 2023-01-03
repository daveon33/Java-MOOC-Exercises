
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    private Scanner scanner;
    private ArrayList<Recipes> recipes;

    public UserInterface(Scanner scanner, ArrayList<Recipes> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }
    
    public void start() {
        showInterface();
    }
    
    public void showInterface() {
        System.out.print("File to read: ");
        String fileToRead = scanner.nextLine();
      
        
        System.out.println("Commands:");
        System.out.println("list - lists the recepies");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        readFile(fileToRead);
        
        
        
        while(true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("list")) {
                System.out.println("Recipes:");
                
                for(Recipes recipe: recipes) {
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
                }
            }
            
            if(command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
    
                
                System.out.println("Recipes:");
                for(Recipes recipe: recipes) {
                    if(recipe.getName().contains(word)) {
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
                    }
                }
            }
            
            if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                
                for(Recipes recipe: recipes) {
                    if(recipe.getCookTime() <= maxCookingTime) {
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
                    }
                }
            }
            
            if(command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                
                
                for(Recipes recipe: recipes) {
                    
                    if(recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookTime());
                    }
                }
                
            }
            
            
        }
        
    }
    
    public void readFile(String fileToRead) {
        List<String> data = new ArrayList<String>();
        List<String> provisional = new ArrayList<String>();
        
        try(Scanner fileReader = new Scanner(Paths.get(fileToRead))) {
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                
                data.add(row);
            }
            
            
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
        
        for(String dato: data) {
            if(dato.equals("")) {
                List<String> arrlist2 = provisional.subList(2, provisional.size());
                ArrayList<String> allIngredients = new ArrayList<>(arrlist2);
                recipes.add(new Recipes(provisional.get(0), Integer.valueOf(provisional.get(1)), allIngredients));
                provisional.clear();
                
                continue;
            }
            
            provisional.add(dato);
        }
        
        List<String> arrlist2 = provisional.subList(2, provisional.size());
        ArrayList<String> allIngredients = new ArrayList<>(arrlist2);
        
        
        
        recipes.add(new Recipes(provisional.get(0), Integer.valueOf(provisional.get(1)), allIngredients));
        
        
        
    }
    
    
}
