import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();

        ActivityTracker temp = new ActivityTracker(goal);

        boolean done = false;
        while (!done) {
            System.out.print("Enter the number of minutes for your activity session, -1 to end: ");
            int something = scan.nextInt();
            scan.nextLine();
            if(something == -1){
                done = true;
            } else {
                temp.logMinutes(something);
            }
        }

        System.out.println("Good job being active! Let's look at your stats: ");
        System.out.println("Number of sessions: " + temp.getSessions());
        System.out.println("Total number of minutes: " + temp.getTotalMinutes());
        System.out.println("Longest session logged: " + temp.getMaxMinutes());
        System.out.println("Goal reached: " + temp.goalAchieved());
    }
}
