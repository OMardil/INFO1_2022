import java.util.Scanner;

public class ProblemaQuiz {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Cuántas monedas de $1.00 tiene Martha?: ");
    int dineroMartha = keyboard.nextInt();
    int billetes500 = 0;
    int billetes200 = 0;
    int billetes100 = 0;
    int billetes50 = 0;
    int monedasRestantes = 0;

    //CODIGO PARA HACER LOS CALCULOS AQUI
    billetes500 = dineroMartha / 500;
    dineroMartha = dineroMartha % 500;

    billetes200 = dineroMartha/200;
    dineroMartha = dineroMartha%200;

    billetes100 = dineroMartha/100;
    dineroMartha = dineroMartha%100;

    billetes50 = dineroMartha/50;
    monedasRestantes = dineroMartha%50;    

    System.out.println(billetes500 + "x500");
    System.out.println(billetes200 + "x200");
    System.out.println(billetes100 + "x100");        
    System.out.println(billetes50 + "x50");
    System.out.println(monedasRestantes + "x1");

    keyboard.close();
    }

}