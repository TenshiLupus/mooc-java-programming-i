
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            if (current < smallest) {
                smallest = current;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexToReturn = startIndex;
        int smallest = array[startIndex];

        for (int i = startIndex; i < array.length; i++) {
            int current = array[i];
            if (current < smallest) {
                smallest = current;
                indexToReturn = i;
            }
        }
        return indexToReturn;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int smallest = indexOfSmallestFrom(array, i);
            swap(array,i,smallest);
            System.out.println(array);
        }
    }
}
