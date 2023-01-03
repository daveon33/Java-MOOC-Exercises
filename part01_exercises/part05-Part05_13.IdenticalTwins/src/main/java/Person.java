
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    public boolean equals(Object compared) {
        
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Person)) {
            return false;
        }
        
        Person newPerson = (Person) compared;
        
        if(this.name.equals(newPerson.name) &&
           this.height == newPerson.height &&
           this.weight == newPerson.weight &&
           this.birthday.equals(newPerson.birthday)) {
            return true;
        }
        
        return false;
    }
}
