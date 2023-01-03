
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String toCube = scanner.nextLine();
            
            if(toCube.equals("end")) {
                break;
            }
            
            int cube = Integer.valueOf(toCube);
            System.out.println(cube * cube * cube);
        }
    }
}
