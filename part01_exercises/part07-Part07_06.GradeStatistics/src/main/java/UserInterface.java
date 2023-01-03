
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
    private Averages setOfGrades;
    private Scanner scanner;
    
    public UserInterface(Averages setOfGrades, Scanner scanner) {
        this.setOfGrades = setOfGrades;
        this.scanner = scanner;
    }
    
    
    public void start() {
        showInterface();
        printGradeDistribution();
                
    }
    
    public void showInterface() {
        System.out.println("Enter point totals, -1 stops:");
        
        while(true) {
            int grade = Integer.valueOf(scanner.nextLine());
            
            if(grade == -1) {
                break;
            }
            
            setOfGrades.addGrade(grade);
        }
        
        System.out.println("Point average (all): " + setOfGrades.calculateAverage());
        
        if(setOfGrades.calculatePassingAverage() == -1) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + setOfGrades.calculatePassingAverage());
        }
        
        System.out.println("Pass percentage: " + setOfGrades.calculatePassingPercentage());
    }
    
    public void printGradeDistribution() {
        String stars = "";
        
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--) {
            for(int grade: setOfGrades.getGrades()) {
                if(grade >= 90 && i == 5) {
                    stars += "*";
                } else if((80 <= grade && grade < 90) && i == 4) {
                    stars += "*";
                } else if((70 <= grade && grade < 80) && i == 3) {
                    stars += "*";
                } else if((60 <= grade && grade < 70) && i == 2) {
                    stars += "*";
                } else if((50 <= grade && grade < 60) && i == 1) {
                    stars += "*";
                } else if((grade < 50) && i == 0) {
                    stars += "*";
                }
            }
            
            System.out.println(i + ": " + stars);
            stars = "";
        } 
    }
}
