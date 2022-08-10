import java.util.Scanner;

public class Problema4_2 {
    public static void main(String[] args){
        // Problema 4: A partir de una oración leída del teclado, regresa true cuando la oración 
        // comienza con lacadena “#ix”, considerando que el caracter ‘#’ es un comodín y 
        // puede ser sustituído por cualquier otro caracter.

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String word = keyboard.nextLine();

        //LOGICA
        if (word.length() >= 3 && word.substring(1,3).equalsIgnoreCase("ix")){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

        keyboard.close();

    }  
}
