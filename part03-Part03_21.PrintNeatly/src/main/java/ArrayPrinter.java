
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        String  s = "";
        for(int i = 0; i < array.length; i++){
            s += array[i];
            if(i != array.length - 1){
                s += ",";
            }
        }
        System.out.println(s);
    }
}
