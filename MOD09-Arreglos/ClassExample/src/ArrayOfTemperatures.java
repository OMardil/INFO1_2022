import java.util.*;

public class ArrayOfTemperatures {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many temperatures do you want to capture?: ");
        int size = keyboard.nextInt();
        double[] temperatures = new double[size];
        double sum = 0;

        for(int i=0; i<temperatures.length; i++){
            System.out.print("Type temperature " + (i+1) + ": ");
            temperatures[i] = keyboard.nextDouble();
            sum = sum + temperatures[i];
        }

        double average = sum / temperatures.length;
        System.out.println("The average is: "+ average);

        for(int i=0;i<temperatures.length;i++){
            if (average > temperatures[i]){
                System.out.println("Temperature is below average: " + temperatures[i]);
            }
            if (average < temperatures[i]){
                System.out.println("Temperature is above average: " + temperatures[i]);
            }
            if (average == temperatures[i]){
                System.out.println("Temperature is average: " + temperatures[i]);
            }
        }
        
        keyboard.close();
    }
}
