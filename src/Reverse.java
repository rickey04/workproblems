import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int input[] = {12, 64, 23, 35, 2, 67, 9, 11};
        int i = 0;
        int j = input.length-1;
        System.out.println("Input: "+Arrays.toString(input));
        while(i < j) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;
            j--;
        }
        System.out.println("Output: "+ Arrays.toString(input));

    }
}
