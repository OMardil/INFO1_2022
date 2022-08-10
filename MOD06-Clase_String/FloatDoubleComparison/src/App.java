import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        System.out.print("What day is today?: ");
        String day = keyboard.nextLine();
        day = day.trim();
        day = day.toUpperCase();

        switch(day) {
            case "MONDAY":
                System.out.println("2x1 in movie tickets");
                break;
            case "TUESDAY":
                System.out.println("Popcorn for $49.00");
                break;            
            case "WEDNESDAY":
                System.out.println("Children tickets are free");
            case "THURSDAY":
                System.out.println("Movie tickets for $35.00");
                break;
            case "FRIDAY":
                System.out.println("Any coffee for $30.00");
                break;
            case "SATURDAY": case "SUNDAY":
                System.out.println("No promos :("); 
                break;
            default:
                System.out.println("No promos :(");
                break;
        }




/*         if (day.equals("Monday")){
            System.out.println("2x1 in movie tickets");
        } else if (day.equals("Tuesday")){
            System.out.println("Popcorn for $49.00");
        } else if (day.equals("Wednesday") || day.equals("Thursday")){
            System.out.println("Movie tickets for $35.00");
        } else if (day.equals("Friday")){
            System.out.println("Any coffee for $30.00");            
        } else if (day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("No promos :(");            
        } else {
            System.out.println("Error: try again");
        }
 */
        keyboard.close();

    }
}
