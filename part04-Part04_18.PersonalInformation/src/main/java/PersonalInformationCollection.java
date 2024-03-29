
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("First name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String id = scanner.nextLine();
            System.out.println("");
            
            PersonalInformation p = new PersonalInformation(name,lastName,id);
            infoCollection.add(p);
            for(PersonalInformation pi : infoCollection){
                System.out.println(pi.getFirstName() + " " + pi.getLastName());
            }
        }
    }
}
