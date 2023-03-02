public class Divisiblebynumber {
    public static void main(String[] args) {

        int input[] = {34, 67, 81, 97, 45, 54, 90, 83};
        int divisibleby2 = 0;
        int divisibleby3 = 0;
        int divisibleby5 = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i]%2==0){
                divisibleby2++;
            }
            if(input[i]%3==0){
                divisibleby3++;
            }
            if(input[i]%5==0){
                divisibleby5++;
            }
        }
        System.out.println("Count of numbers divisible by 2: "+divisibleby2);
        System.out.println("Count of numbers divisible by 3: "+divisibleby3);
        System.out.println("Count of numbers divisible by 5: "+divisibleby5);

    }
}
