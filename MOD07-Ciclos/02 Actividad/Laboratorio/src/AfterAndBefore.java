import java.util.Scanner;

public class AfterAndBefore {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        String s1 = "";
        //1. validamos input
        do {
            System.out.print("Introduzca una frase (3-15): ");
            s1 = keyboard.nextLine();
        } while (s1.length() < 3 || s1.length() > 15);

        System.out.println("Palabra OK!");

        //2. Contar asteriscos
        int count = 0;
        for(int i=1; i<s1.length()-1; i++){
            if (s1.charAt(i) == '*' && s1.charAt(i-1) == s1.charAt(i+1)){
                    System.out.println("FOUND " + (++count) + "!");
            }
        }

    }

}
