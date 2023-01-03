
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        List<String> literacy = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(lastValue -> lastValue[3] + " (" + lastValue[4] + "), " + lastValue[2].split(" ")[1] + ", " + lastValue[5])
                    .sorted((p1, p2) -> {
                        String[] parts = p1.split(",");
                        String[] parts2 = p2.split(",");
                        
                        return parts[2].compareTo(parts2[2]);
                    })
                    .forEach(n -> System.out.println(n));
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
                
    }
}
