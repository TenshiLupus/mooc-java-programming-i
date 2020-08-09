
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;
        // write code here
    }

    public int getCount() {
        return this.count;
        // write code here
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if(count == 0){
            return 0.0;
        }
        return 1.0 * sum / count;
    }
}
