import java.util.Scanner;
public class Reto {
    public static void main(String[] args) throws Exception{
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.print("Diámetro pastel (cm): ");
        String dpastel;
        dpastel = keyboard.nextLine();
        System.out.print("Precio ($): ");
        String precio;
        precio = keyboard.nextLine();
        System.out.print("¿Cuántos invitados?: ");
        String ninvitados;
        ninvitados = keyboard.nextLine();
        double pi = Math.PI;
        int apastel;
        apastel = pi * dpastel;
        System.out.println("Área del pastel: " +apastel);
        System.out.println("Área por cada rebanada: " +apastel/ninvitados);
        System.out.println("Precio por cada rebanada: " +precio/ninvitados);
        keyboard. close();
    }
}