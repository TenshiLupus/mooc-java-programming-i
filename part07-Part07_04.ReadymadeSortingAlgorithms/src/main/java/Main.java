
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] stringArray = {"3", "1", "5", "99", "3", "12"};
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(stringArray));
        
        ArrayList<Integer> integers = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0; i < 60; i++){
            integers.add(rnd.nextInt(60));
        }
        sortIntegers(integers);
        
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("q");
        strings.add("w");
        strings.add("e");
        strings.add("r");
        strings.add("t");
        strings.add("y");
        
        sortStrings(strings);
        System.out.println(strings);
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> Integers){
        Collections.sort(Integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
    
    
    
}
