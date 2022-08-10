public class Test {
    public static void main(String[] args) {
        
        String data = oneTwo("abcdefg"); // bcaefdg
        System.out.println(data);

    }

    private static String oneTwo(String str) {

        String newString = "";
        int times = str.length()/3;
        int remainder = str.length()%3;

        for(int i=0; i<times; i++){
            char pos1 = str.charAt(i*3);   //3
            char pos2 = str.charAt(i*3+1); //4
            char pos3 = str.charAt(i*3+2); //5  
            newString += ""+pos2+pos3+pos1+"";
        }

        return newString + str.substring(times*3, times*3+remainder);

    }
}







