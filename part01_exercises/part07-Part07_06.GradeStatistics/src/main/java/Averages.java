
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
public class Averages {
    private ArrayList<Integer> grades;
    private double average;
    private double passingAverage;
    private int passingGradeCounter;
    
    public Averages() {
        this.grades = new ArrayList<>();
        this.average = 0;
        this.passingAverage = 0;
        this.passingGradeCounter = 0;
    } 
    
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    
    public void addGrade(int grade) {
        if(grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }
    
    public double calculateAverage() {
        for(int grade: grades) {
            average += grade;
        }
        
        return average / grades.size();
    }
    
    public double calculatePassingAverage() {
        for(int grade: grades) {
            if(grade >= 50) {
                passingAverage += grade;
                passingGradeCounter += 1;
            }
        }
        
        if(passingGradeCounter == 0) {
            return -1;
        }
        
        return passingAverage / passingGradeCounter;
    }
    
    public double calculatePassingPercentage() {
        int numberOfAprovals = 0;
        
        for(int grade: grades) {
            if(grade >= 50) {
                numberOfAprovals += 1;
            }
        }
        
        return (double) numberOfAprovals * 100 / grades.size();
    }
}
