import java.util.ArrayList;

public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> toReturn = new ArrayList<>();
        for(int i = 0; i < exercises.size(); i++){
            Exercise e = exercises.get(i);
            toReturn.add(e.getName());
        }
        return toReturn;
    }
    
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }
    
    public void remove(String exercise){
        this.exercises.remove(exercise);
        for(int i = 0; i < exercises.size(); i++){
            if(exercises.get(i).getName().equals(exercise)){
                exercises.remove(i);
            }
        }
    }
    
    public void markAsCompleted(String exercise){
        for(Exercise e : exercises){
            if(e.getName().equals(exercise)){
                e.setCompleted(true);
            }
        }
    }   
    
    public boolean isCompleted(String exercise){
        for(Exercise ex : exercises){
            if(ex.getName().equals(exercise)){
                return ex.isCompleted();
            }
        }
        return false;
    }
}
