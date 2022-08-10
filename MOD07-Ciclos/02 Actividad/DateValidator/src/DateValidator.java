import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        boolean validDate = false;

        do{
            System.out.print("Ingrese una fecha en formato dd/mm/yyyy: ");
            String date = keyboard.nextLine();

            //block of code that changes validDate to true if date is valid
            validDate = checkDate(date);

            if(!validDate){
                System.out.println("La fecha es inválida, vuelve a intentar.");
            }

        }while(!validDate); //(validDate == false)

        keyboard.close();
    }

    public static boolean checkDate(String date){
        boolean isValid = true;

        //check date length
        if (date.length() < 10){
            isValid = false;
            return isValid;
        }

        // 09/11/2021
        String day = date.substring(0,2); //09
        String firstSlash = date.substring(2,3); // /
        String month = date.substring(3, 5); //11
        String secondSlash = date.substring(5, 6); // /
        String year = date.substring(6, 10); //2021

        //validate slashes in date
        if(!firstSlash.equals("/") || !secondSlash.equals("/")){
            isValid = false;
            return isValid;
        }

        //check year is valid //2021
        for(int i=0; i<year.length(); i++){
            char pos = year.charAt(i);
            if (!Character.isDigit(pos)){
                isValid = false;
                return isValid;
            }
        }

        return true;
    }
}
