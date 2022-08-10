import java.util.*;

public class DoWhile {
    
    public static void main(String[] args){

        boolean validInput = false;
        int i;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Type a number between 1 and 10: ");
            i = keyboard.nextInt();
            if (i>=1 && i<=10){
                validInput = true;
            } else {
                validInput = false;
                System.out.println("Error. Try again!");
            } 
        } while (!validInput);

        System.out.println("Succes! " + i + " is a valid number.");
        keyboard.close();
    }

}
