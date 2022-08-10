import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What day is today?: ");
        String day = keyboard.nextLine();

        if (day.equals("Monday")){
            System.out.println("2x1 in movie tickets");
        } else if (day.equals("Tuesday")){
            System.out.println("Popcorn for $49.00");
        } else if (day.equals("Wednesday")){
            System.out.println("Movie tickets for $35.00");
        } else if (day.equals("Thursday")){
            System.out.println("Any coffee for $30.00");            
        } else if (day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("No promos :(");            
        } else {
            System.out.println("Invalid day! try again");
        }

        keyboard.close();

    }
}
