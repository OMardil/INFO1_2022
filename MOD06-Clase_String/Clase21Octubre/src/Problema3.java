import javax.swing.JOptionPane;

public class Problema3 {
    public static void main(String[] args) throws Exception {

        // Problema 3: Consideraremos un número como “teen” cuando se encuentra en el rango de 13 a 19 inclusive. 
        // Lee tres números del teclado, y al final imprime la información de acuerdo con lo que leíste:
        // No teens
        // One teen
        // Two teens
        // Three teens
        int count = 0;
        String input = JOptionPane.showInputDialog("Enter a number (1)");    //input
        int number = Integer.parseInt(input);

        if(13 <= number && number <= 19){
            count++;
        }

        input = JOptionPane.showInputDialog("Enter a number (2)");    //input
        number = Integer.parseInt(input);

        if(13 <= number && number <= 19){
            count++;
        }        

        input = JOptionPane.showInputDialog("Enter a number (3)");    //input
        number = Integer.parseInt(input);

        if(13 <= number && number <= 19){
            count++;
        }               

        String message = "";
        if (count == 0){
            message = "No teens";
        } else if (count == 1){
            message = "One teen";
        } else if (count == 2){
            message = "Two teens";
        } else if (count == 3){
            message = "Three teens";
        }

        JOptionPane.showMessageDialog(null, message); //output

    }
}
