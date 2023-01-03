
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
    private TodoList aTodoList;
    private Scanner scanner;

    public UserInterface(TodoList aTodoList, Scanner scanner) {
        this.aTodoList = aTodoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                System.out.print("To add: ");
                String newTask = scanner.nextLine();
                
                aTodoList.add(newTask);
            }
            
            if(command.equals("list")) {
                aTodoList.print();
            }
            
            if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int taskId = Integer.valueOf(scanner.nextLine());
                aTodoList.remove(taskId);
            }
        }
    }
}
