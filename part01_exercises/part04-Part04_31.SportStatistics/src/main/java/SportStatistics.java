
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] parts = row.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int pointsTeam1 = Integer.valueOf(parts[2]);
                int pointsTeam2 = Integer.valueOf(parts[3]);
                
                if(team1.equals(team) || team2.equals(team)) {
                    games++;
                }
                
                if(team1.equals(team)) {
                    if(pointsTeam1 > pointsTeam2) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if(team2.equals(team)) {
                    if(pointsTeam2 > pointsTeam1) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }

}
