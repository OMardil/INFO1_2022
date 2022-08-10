import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What day is today?: ");
        String day = keyboard.nextLine();

        switch(day){
            case "Monday":
                System.out.println("2x1 in movie tickets");
                break;
            case "Tuesday":
                System.out.println("Popcorn for $49.00");
                break;
            case "Wednesday": 
                System.out.println("Movie tickets for $35.00");
                break;
            case "Thursday":                
                System.out.println("Any coffee for $30.00");  
                break;
            case "Friday": 
            case "Saturday": 
            case "Sunday":             
                System.out.println("No promos :(");           
                break;
            default: 
                System.out.println("Invalid day! try again");
            }


        keyboard.close();
    }
}
