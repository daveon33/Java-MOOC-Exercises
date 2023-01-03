
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        String stars = "";
        
        for(int i = 0; i < array.length; i++) {
           for(int j = 0; j < array[i]; j++) {
               stars += "*";
               
           }
           System.out.print(stars);
           
           stars = "";
           System.out.println("");
        }
    }

}
