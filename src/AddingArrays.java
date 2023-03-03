public class AddingArrays {
    public static void main(String[] args) {
        String S=" ";
        int array1[] = {1, 3, 5};
        int array2[] = {2, 4, 7, 9};
        int[] finalArray =new int[array1.length+ array2.length];
        for(int i=0;i< array1.length;i++){
            finalArray[i]= array1[i];
        }
        for(int i=0;i< array2.length;i++){
            finalArray[array1.length+i]= array2[i];
        }
        for(int i=0;i< finalArray.length;i++){
            S=S+finalArray[i]+" ";
        }
            System.out.println("finalArray is: {"+S+"}");
    }
}
