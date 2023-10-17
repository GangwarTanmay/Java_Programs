package ProblemsOnArray;// Counting occurrence of each digit in a number
import java.util.Scanner;

public class OccurrenceOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int count = 0;
        String number = String.valueOf(n);

        for(int i=0 ; i< number.length() ; i++)
        {
            count = 0;
            for(int j=i ; j<number.length(); j++)
            {
                if(number.charAt(i) == number.charAt(j))
                {
                    count ++;
                }
            }
            System.out.println("Count of "+ number.charAt(i)+" = "+count);
        }

    }
}
