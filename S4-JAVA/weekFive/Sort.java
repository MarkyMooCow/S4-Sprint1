package weekFive;
// Sorts an array alphabetically

import java.util.Arrays;

public class Sort {

    public void sortStringArray(){
        String[] arrayToSort = new String[] {"Oscar", "Charlie", "Ryan", "Adam", "David", "George"};

        // To srot an array
        Arrays.sort(arrayToSort);

        // Diaplay sorted Array
        for (int i = 0; i < arrayToSort.length; i++)
        System.out.println(arrayToSort[i]);
    }
    
}
