import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Cuantas materias llevas?: ");
    int materias = Integer.parseInt(keyboard.nextLine());
    double clases[] = new double[materias];
    double acum = 0;

   for(int i = 0; i < clases.length; i++){
    System.out.print("Ingresa la calificación de tu materia " + (i+1) + ": "); 
    clases[i] = Double.parseDouble(keyboard.nextLine());
    acum+= clases[i];
   }
   double promedio;
   if (materias > 0){
       promedio = acum / materias;
   }
   System.out.println("Tu promedio es: " + promedio);
   keyboard.close();

    }

}
