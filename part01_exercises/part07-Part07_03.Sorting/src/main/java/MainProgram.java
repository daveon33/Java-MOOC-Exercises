
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int minValue = 1000;
        
        for(int number : array) {
            if(number < minValue) {
                minValue = number;
            }
        }
        
        return minValue;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestNumber = smallest(array);
        int indexOfSmallest = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == smallestNumber) {
                indexOfSmallest = i;
            }
        } 
        
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int minValue = 1000;
        int indexOfValue = 0;
        
        for(int i = startIndex; i < table.length; i++) {
            if(table[i] < minValue) {
                minValue = table[i];
                indexOfValue = i;
            }
        }
        
        return indexOfValue;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int bridgeValue = array[index1];
        array[index1] = array[index2];
        array[index2] = bridgeValue;
    }
    
    public static void sort(int[] array) {
        int indexOfTheSmallest = 0;
        
        for(int i = 0; i < array.length; i++) {
            indexOfTheSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfTheSmallest);
        }
    }

}
