
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> listOfGrades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.listOfGrades = new ArrayList<>();
    }
    
    public double averageOfPoints(){
        if(this.listOfGrades.isEmpty()){
            return -1;
        }
        int total = 0;
        for(int i : this.listOfGrades){
            total += i;
        }
        double average = total * 1.0 / this.listOfGrades.size();
        return average;
    }

    public void addGradeBasedOnPoints(int points) {
        this.listOfGrades.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    
    public double averageOfGrades(){
        if(grades.isEmpty()){
            return -1;
        }
        int total = 0;
        for(int i : grades){
            total += i;
        }
        double average = (total * 1.0 / grades.size());
        return average;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
