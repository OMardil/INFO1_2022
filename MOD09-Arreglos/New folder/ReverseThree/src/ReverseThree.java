public class ReverseThree {
    
        /*Given an array of ints length 3, return a new array with the elements 
        in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

        reverse3([1, 2, 3]) → [3, 2, 1]
        reverse3([5, 11, 9]) → [9, 11, 5]
        reverse3([7, 0, 0]) → [0, 0, 7]
        */
    public static void main(String[] args) throws Exception {

        int[] input1 = {1,2,3};
        int[] output1;
        output1 = reverse3(input1); //output1 should store {3,2,1}

        //for-each
        for(int element: output1){
            System.out.println(element);
        }
    }

    public static int[] reverse3(int[] nums) {
        int[] out = new int[3];
        int outIndex = 0;

        //for 
        for(int i=nums.length-1; i>=0; i--){
            out[outIndex++] = nums[i];
        }
        return out;
    }
    
}
