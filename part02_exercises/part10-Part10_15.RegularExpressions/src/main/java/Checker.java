

public class Checker {
    
    public boolean isDayOfWeek(String string) {
        String regex = "(mon|tue|wed|thu|fri|sat|sun)";
        
        if(string.matches(regex)) {
            return true;
        }
        
        return false;
    }
    
    public boolean allVowels(String string) {
        String regex = "(a|e|i|o|u)*";
        
        if(string.matches(regex)) {
            return true;
        }
        
        return false;
    }
    
    public boolean timeOfDay(String string) {
        String regex = "[0-2][0-9]:[0-5][0-9]:[0-5][0-9]";
        String regexLimit = "24:[0-5][0-9]:[0-5][0-9]";
        
        if(string.matches(regexLimit)) {
            return false;
        }
        
        if(string.matches(regex)) {
            return true;
        }
        
        return false;
    }
}
