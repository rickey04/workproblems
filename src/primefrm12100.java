public class primefrm12100 {
    public static void main(String[] args) {
        boolean primenum = true;
        int i,j = 0;
        for (i = 2; i <= 100; i++) {
            for ( j = 2; j < i; j++) {
                if (i % j == 0) {
                    primenum = false;
                    break;
                }
            }
        }
        if(primenum){
        System.out.println("Prime numbers from 1 to 100 are: " + i);
    }}
}
