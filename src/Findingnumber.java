public class Findingnumber
{
    public static void main(String[] args)
    {
        int numbers[]={34, 67, 81, 97, 45, 54, 90, 83};
        int searchingNumber = 40;
        boolean Boolean = false;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==searchingNumber)
            {
                System.out.println("Given number is   present in the list and the Position is at: " + i);
                Boolean = true;
                break;
            }
        }
            if(Boolean == false)
            {
                System.out.println("Given number is not present in the list");
            }

    }
}
