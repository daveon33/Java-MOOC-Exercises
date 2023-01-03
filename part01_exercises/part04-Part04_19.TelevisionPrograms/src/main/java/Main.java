import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Name:");
            String nameProgram = scanner.nextLine();
            
            if(nameProgram.equals("")) {
                break;
            }
            
            System.out.println("Duration:");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(nameProgram, duration));
        }
        
        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram tvShow: programs) {
            if(tvShow.getDuration() <= maxDuration) {
                System.out.println(tvShow.getName() + "," + tvShow.getDuration());
            } 
        }

    }
}
