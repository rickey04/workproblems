 import java.util.Scanner;
        public class primeornot {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number:");
                int number = scanner.nextInt();
                boolean primenum = true;
                for(int i=2;i<number;i++) {
                    if (number % i == 0) {
                        primenum = false;
                        break;
                    }}
                        if (primenum==true) {
                            System.out.println("Given "+number+" number is prime");
                        }
                     else {
                        System.out.println("Given "+number+" number is not prime");
                    }

            }
        }

