
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            boolean found = false;
            while(fileReader.hasNextLine()){
                String current = fileReader.nextLine();
                if(current.equals(searchedFor)){
                    found = true;
                    System.out.println("Found!");
                    break;
                }
            }
            if(!found){
                System.out.println("Not found.");
            }
            
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed");
        }
    }
}
