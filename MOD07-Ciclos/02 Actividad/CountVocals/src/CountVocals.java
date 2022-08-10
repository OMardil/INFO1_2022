import java.util.Scanner;

public class CountVocals {
    public static void main(String[] args) throws Exception {
        //El siguiente programa leerá un String del teclado con un tamaño variable. 
        //Diseña un programa que recorra el String e imprima cuántas 
        //vocales (en minúscula) hay en dicho texto. 
        //Si una palabra empieza o termina con una vocal, NO DEBERÁ contar.

        //"Hola" -> 1
        //"como " -> 2

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Escribe una palabra o frase: ");
        String word = keyboard.nextLine();
        word = word.toLowerCase();

        int len = word.length();
        int vocalCount = 0;
        
        //for(initialization; condition; update)
        for(int i=1; i<len-1; i++){
            char letter = word.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vocalCount++;
            }
        }
        System.out.println("Vocal count: "+ vocalCount);
    }
    
    
}
