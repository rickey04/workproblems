public class SameNumbersArray {
    public static void main(String[] args) {
        String S=" ";
        int array1[] = {1,3,6,2};
        int array2[] = {3,1,5,4};

        for(int i=0;i< array1.length;i++){
            for(int j=0;j< array2.length;j++){
                if(array1[i]==array2[j])
                    S=S + array1[i]+" ";
            }
        }
        System.out.println("The common values are: {"+S+"}");
    }
}
