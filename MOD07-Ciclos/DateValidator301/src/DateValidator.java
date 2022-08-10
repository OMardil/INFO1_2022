import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) throws Exception {

        // dd/mm/yyyy
        // 0. El dia, mes y año deben de ser puros digitos (0123456789)
        // 1. mes >= 01 && mes <= 12
        // 2. año >= 0 && año <= 9999
        // 3. dia depende del mes
        // 4. dia >= 01 &&
        //   ( dia <= 31 cuando mes 01, 03, 05, 07, 08, 10, 12)
        //   ( dia <= 30 cuando mes 04, 06, 09, 11)
        //   ( dia == 28 cuando mes sea 02 && año no es biciesto)
        //   ( dia == 29 cuando mes sea 02 && año sea biciesto)
        // 5. Tamaño de la fecha == 10
        // 6. Caracter de la posicion 2 == '/'
        // 7. Caracter de la posicion 5 == '/'

        Scanner keyboard = new Scanner(System.in);
        boolean validDate;
        
        do{
            System.out.print("Escriba una fecha (dd/mm/yyyy): ");
            String date = keyboard.nextLine();
            validDate = true;

            // 5. Tamaño de la fecha == 10
            if (date.length() != 10){
                validDate = false;
            }  else {
            // 0. El dia, mes y año deben de ser puros digitos (0123456789)
                // 10/11/2021
                String dia = date.substring(0,2);
                String primerDiagonal = date.substring(2,3);  
                String mes = date.substring(3,5);                                
                String segundaDiagonal = date.substring(5,6);                                
                String año = date.substring(6,10);                                

                for(int i=0; i<dia.length(); i++){
                    if (Character.isDigit(dia.charAt(i)) == false){
                        validDate = false;
                    }
                }

                for(int i=0; i<mes.length(); i++){
                    if (Character.isDigit(mes.charAt(i)) == false){
                        validDate = false;
                    }
                }   
                
                for(int i=0; i<año.length(); i++){
                    if (Character.isDigit(año.charAt(i)) == false){
                        validDate = false;
                    }
                }                    
                
            }

        
        }while(!validDate);  //validDate == false


        keyboard.close();


    }
}
