
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
    private TodoList list;
    private Scanner input;

    public UserInterface(TodoList list, Scanner input) {
        this.list = list;
        this.input = input;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = input.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                System.out.print("To add: ");
                String task = input.nextLine();
                list.add(task);
            }
            
            if(command.equals("list")) {
                list.print();
            }
            
            if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int taskToRemove = Integer.valueOf(input.nextLine());
                list.remove(taskToRemove);
            }
        }
    }
}
