public class fibonacci {
    public static void main(String[] args) {
        String fibonacci=" ";
        int a = 0,b = 1,c=0,n=10;
        for(int i=0;i<n;i++) {
            c = a + b;
            fibonacci=fibonacci+c+",";
            a = b;
            b = c;
        }
        System.out.println("fibonacci Series: " +fibonacci+"......");
    }
}
