public class Imprime {
    
        public static void main(String[] args){
            int a = 0, b = 10, c = 1;
            int result;
            result = a++ * b - ++c;
            System.out.println("Step 1: " + result);
            System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", result: " + result );

            result = (-result) % (b/++c);
            System.out.println("Step 2: " + result);
            System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", result: " + result );

            result = a*b*c;
            System.out.println("Step 3: " + result);
            System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", result: " + result );

            result = a + b / c * a;
            System.out.println("Step 4: " + result);
            System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", result: " + result );

        }
    }
    