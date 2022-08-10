import java.util.Scanner;

public class ParrotSalute {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int groupSize = 0;
        //Validar el tamaño del grupo
        do {
            System.out.print("Size of your group (1-10): ");
            groupSize = keyboard.nextInt();
        } while (groupSize <= 0 || groupSize >= 11);

        //Imprimir saludos del cotorro
        
        for(int i=0; i<groupSize; ++i){
            System.out.print("Hi! ");
        }
        System.out.println();
    }
    
}
