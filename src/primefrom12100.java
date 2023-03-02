public class primefrom12100 {
    public static void main(String[] args) {
        {
            String prime=" ";
            int i,j;
            for (i = 2; i <= 100; i++) {
                int count = 0;
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count = 1;
                        break;
                    }
                }
                if (count == 0) {
                    prime = prime+i+" "; // storing int values to string!!!
                }
            }
            System.out.println("Prime numbers from 1 to 100 are: "+prime);
        }
    }
}