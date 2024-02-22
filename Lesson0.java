import java.util.Scanner;

public class Lesson0 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int team1Goals, team2Goals;

        if (scan.hasNextInt()) {
            team1Goals = scan.nextInt();
        } else {
            System.out.println("Bad input");
            scan.close();
            return;
    }

        if (scan.hasNextInt()) {
            team2Goals = scan.nextInt();
        } else {
            System.out.println("Bad input");
            scan.close();
            return;
    }

    if (team1Goals < 0 || team2Goals < 0) {
        System.out.println("Bad Input");
    } else {
        int goalDifference = Math.abs(team1Goals - team2Goals);


        if (team1Goals > team2Goals) {
            System.out.println("The match is won by " + goalDifference + " goals");
        } else if (team1Goals < team2Goals) {
            System.out.println("The match is won by " + goalDifference + " goals");
        } else {
            System.out.println("The match is a tie");
        }
        }
        scan.close();

    }

}

