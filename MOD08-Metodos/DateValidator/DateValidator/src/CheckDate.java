import java.util.*;

public class CheckDate {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        String date;
        checkIfValidDate("20/20/1989");
        checkIfValidDate("01/10/19");
        checkIfValidDate("31/12/9999");
        checkIfValidDate("32/12/9999");
        checkIfValidDate("31/13/9999");
        checkIfValidDate("31/1/2020");
        checkIfValidDate("3111219999");
        checkIfValidDate("29/02/4000");
        checkIfValidDate("29/02/1000");
        checkIfValidDate("28/02/2000");
        checkIfValidDate("28/02/4000");
        checkIfValidDate("31/03/2020");
        keyboard.close();
    }

    private static void checkIfValidDate(String date) {
        if(isValidDate(date))
            System.out.println(date + " is a valid date");
        else            
            System.out.println(date + " is an invalid date");        
    }

    private static boolean isValidDate(String date) {
        //date should have format DD/MM/AAAA
        if (date.length() != 10)
            return false;

        if (date.charAt(2) != '/' || date.charAt(5) != '/')
            return false;


        //check DD and MM and AAAA are numeric
        int year, month, day;
        if (!isNumeric(date.substring(0,2)) || !isNumeric(date.substring(3,5)) || !isNumeric(date.substring(6,10))){
            return false;
        } else{
            day = Integer.parseInt(date.substring(0,2));
            month = Integer.parseInt(date.substring(3,5));
            year = Integer.parseInt(date.substring(6,10));
        }

        //check valid year
        if (year <= 0 || year > 9999)
            return false;    

        //check valid month
        if (month <= 0 || month >= 13)
            return false;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day > 31 || day < 1)
                    return false;
                break;
            case 4: case 6: case 9: case 11:     
                if (day > 30 || day < 1)
                    return false;
                break; //this break cannot be reached           
            case 2:
                if (isLeapYear(year) && day > 29){
                    return false;
                } else if (!isLeapYear(year) && day > 28)
                    return false;
                break;
            }

        return true;
    }

    private static boolean isLeapYear(int year) {
        // leap years occur every 4 years, but every 100 years we skip a leap year unless it is divisible by 400.
        if ((year%4==0 && year%100!=0) || (year%4==0 && year%400==0))
            return true;
        
        return false;
    }

    public static boolean isNumeric(String str) {
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
}
