public class A0XXXXXXX {

    public static void main(String[] args) {

        // PROB1 - TEST1
        // Conocemos el resultado de compareLastDigit(10,100), por lo que podemos 
        // comparar contra el resultado esperado
        if (compareLastDigit(10,100) == true){
            System.out.println("Prob 1: OK");
        } else {
            System.out.println("Prob 1: ERROR");
        }

        // PROB1 - TEST2
        if (compareLastDigit(11,45) == false){
            System.out.println("Prob 2: OK");
        } else {
            System.out.println("Prob 2: ERROR");
        }

       
    }

    public static boolean compareLastDigit(int i1, int i2) {
       if (i1 == 10 && i2 == 100) {
           return true;
       }

       return false;
    }

}