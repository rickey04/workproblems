import java.util.Scanner;

public class SingleDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a,sum=0,Output=0,num = sc.nextInt();
        while (num>0){
            a=num%10;
            sum=sum+a;
            num=num/10;
        }
        if(sum<=9)
        System.out.println("The Single digit Output of given number is: "+sum);
        else {
            while (sum>0) {
                int x = sum % 10;
                Output = Output + x;
                sum = sum / 10;
            }
            System.out.println("The Single digit Output of given number is: "+Output);
        }
    }
}
