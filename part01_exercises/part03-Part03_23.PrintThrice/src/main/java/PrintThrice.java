
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String word = scanner.nextLine();
        String wordThreeTimes = "";
        for(int i = 0; i < 3; i++) {
            wordThreeTimes += word;
        }
        
        System.out.println(wordThreeTimes);

    }
}
