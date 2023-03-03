public class swap {
    public static void main(String[] args) {
        int a = 10,b = 20, temp;
        System.out.println("Original values before swap are a="+a+" and b="+b );
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped values are a="+a+" and b="+b);
    }
}
