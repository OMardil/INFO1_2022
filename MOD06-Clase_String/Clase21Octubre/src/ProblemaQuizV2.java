import java.util.Scanner;

public class ProblemaQuizV2 {

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
    monedasRestantes = dineroMartha;

    billetes200 = dineroMartha / 200;
    dineroMartha = dineroMartha % 200;

    System.out.println(billetes500 + "x500");
    System.out.println(monedasRestantes + "x1");

    keyboard.close();
    }

}