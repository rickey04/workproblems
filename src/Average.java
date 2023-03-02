public class Average {

    public static void main(String[] args) {
        int input[]= {1,2,3,4,5,6};
        int sum=0;
        double average =0;
        for(int i=0;i<input.length;i++){
            sum=sum+input[i];
            average=(double)sum/(input.length);
        }
        System.out.println("AVERAGE IS:" + average);
    }
}
