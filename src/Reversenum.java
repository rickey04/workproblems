import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a,number = sc.nextInt();
        int num = number;
        String reverse =" ";
        while (number>0){
            a = number%10;
            reverse = reverse+a+"";
            number=number/10;
        }
        System.out.println("Reverse of "+num+" is:"+reverse);
    }
}
