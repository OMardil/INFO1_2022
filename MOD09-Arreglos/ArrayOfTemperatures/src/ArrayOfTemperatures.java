import java.util.*;

public class ArrayOfTemperatures {
    public static void main(String[] args) throws Exception {

        double[] temperatures = new double[7];

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 7 temperatures");

        double sum = 0;

        for(int i=0; i<7; i++){
            temperatures[i] = keyboard.nextDouble();
            sum = sum + temperatures[i];
        }

        double average = sum / 7;
        System.out.println("The average is: " + average);

        System.out.println("The temperatures are:");
        
        for(int i=0; i<temperatures.length; i++){
            if (temperatures[i] > average){
                System.out.println(temperatures[i] + " is above average.");
            }
            if (temperatures[i] < average){
                System.out.println(temperatures[i] + " is below average.");
            }
            if (temperatures[i] == average){
                System.out.println(temperatures[i] + " is the average.");
            }
        }

        keyboard.close();
    }
}
