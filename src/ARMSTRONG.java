import java.util.Scanner;

public class ARMSTRONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a,sum=0,num = sc.nextInt();
        int number=num;
        while (num>0){
            a = num % 10;
            a= a*a*a;
            sum=sum+a;
            num=num/10;
        }
        if(sum==number) {
            System.out.println("It's an ARMSTRONG number");
        }
        else{
            System.out.println("It's not an ARMSTRONG number");
        }
    }
}
