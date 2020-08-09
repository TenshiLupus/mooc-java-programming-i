
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        try(Scanner scanner = new Scanner(Paths.get(file))){
            int count = 0;
            int wins = 0;
            int losses = 0; 
            while(scanner.hasNextLine()){
                String current = scanner.nextLine();
                String[] data = current.split(",");
                String homeTeam = data[0];
                String visitingTeam = data[1];
                int homePoints = Integer.valueOf(data[2]);
                int visitingPoints = Integer.valueOf(data[3]);
                if(homeTeam.equals(team)){
                    count++;
                    if(homePoints > visitingPoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }
                if(visitingTeam.equals(team)){
                    count++;
                    if(homePoints < visitingPoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
