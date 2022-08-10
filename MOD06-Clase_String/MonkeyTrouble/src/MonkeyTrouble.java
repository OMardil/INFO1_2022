import java.util.*;

public class MonkeyTrouble {
    public static void main(String[] args) throws Exception {

        String m1 = ""; //store m1 name
        String m2 = ""; //store m2 name

        boolean m1IsSmiling; //m1 = monkey1 (true/false)
        boolean m2IsSmiling; //m2 = monkey2

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Name of first monkey: ");
        m1 = keyboard.nextLine();

        System.out.print("Name of second monkey: ");
        m2 = keyboard.nextLine();       

        System.out.print("Is " + m1 + " smiling? (true/false): ");
        m1IsSmiling = keyboard.nextBoolean();

        System.out.print("Is " + m2 + " smiling? (true/false): ");
        m2IsSmiling = keyboard.nextBoolean();        

        if ((m1IsSmiling && m2IsSmiling) || (!m1IsSmiling && !m2IsSmiling)){
            System.out.println("We are in trouble!");
        } else {
            System.out.println("We are fine!");
        }

    }
}
