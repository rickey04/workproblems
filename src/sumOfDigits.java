import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a,sum=0,num = sc.nextInt();
        while (num>0){
            a=num%10;
            sum=sum+a;
            num=num/10;
        }
        System.out.println("The sum of digits of given number is: "+sum);
    }
}
