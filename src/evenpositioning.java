import java.util.Arrays;

public class evenpositioning {
    public static void main(String[] args) {
        int input[]= {34, 67, 81, 97, 45, 54, 90, 83};
        for(int i=0;i<input.length;i++){
            if(i%2!=0){
                System.out.print(input[i]+" ");
            }
        }
    }
}
