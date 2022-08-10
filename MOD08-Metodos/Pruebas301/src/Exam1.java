public class Exam1 {
    public static void main(String[] args) {
        int loopCounter = 1;
        int a = 0;
        do {
            int b = 0;			
            for(int i = 0; i<=5; i++) {
                b = modify(i);
                a = a+b;
            }
            System.out.println(a);
            loopCounter++;
        } while (loopCounter<=3);	
    }

    public static int modify(int num) {
        if (num < 2) {
            num = num*-2;
        } else {
            num = num*2;
        }
        return num;
    }
}


