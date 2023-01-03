
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class Employees {
    private ArrayList<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator groupOfPeople = peopleToAdd.iterator();
        
        while(groupOfPeople.hasNext()) {
            Person nextEmployee = (Person) groupOfPeople.next();
            employees.add(nextEmployee);
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> groupOfPeople = this.employees.iterator();
        
        while(groupOfPeople.hasNext()) {
            Person nextEmployee = groupOfPeople.next();
            if(education.ordinal() == nextEmployee.getEducation().ordinal()) {
                groupOfPeople.remove();
            }
        }
    }
    
    public void print() {
        Iterator<Person> groupOfPeople = this.employees.iterator();
        
        while(groupOfPeople.hasNext()) {
            System.out.println(groupOfPeople.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()) {
            Person nextEmployee = iterator.next();
            
            if(education.ordinal() == nextEmployee.getEducation().ordinal()) {
                System.out.println(nextEmployee);
            }
        }
    }
    
}
