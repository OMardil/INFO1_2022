public class DoublePrinter {
    public static void main(String[] args) throws Exception {

        double num = Math.PI;
        System.out.println(num);

        printDouble(num, 5);    

    }

    //Metodo que nos permita retornar una variable de tipo String
    // con el contenido de un parámetro de entrada truncado a ciertos decimales.
    public static String convertToDouble(double num, int decimalPlaces){
        int aux = 1;
        for(int i=0; i<decimalPlaces; i++){
            aux = aux * 10;
        }

        int decimalsPart = 0;
        int integerPart = 0;

        double num2 = num;
        num2 = num2 * aux;
        decimalsPart = (int)num2 % aux;
        integerPart = (int)num2/aux;

        String output;
        output = Integer.toString(integerPart);
        if (decimalPlaces > 0){
            output = output + "." + decimalsPart;
        }
        return output;
    }

    public static void printDouble(double num, int decimalPlaces){
        String s1 = convertToDouble(num, decimalPlaces);
        System.out.println(s1);
    }

}
