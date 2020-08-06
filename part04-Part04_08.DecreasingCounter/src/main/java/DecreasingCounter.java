
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if(value == 0){
            return;
        }else{
            this.value = value - 1;
        }
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
    }
    
    public void reset(){
        this.value = 0;
    }

    // the other methods go here
}
