public class noOfDigits {
    public static void main(String[] args) {
        int num = 4536;
        int digits = 0;
        while(num>0){
            num= num/10;
            digits++;
        }
        System.out.println("Output: "+ digits);
    }
}
