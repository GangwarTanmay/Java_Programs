package ProblemsOnArray;
import java.util.Scanner;

public class FibinacciSeries {
    public static void main(String[] args) {
        int first_term, second_term,third_term;
        first_term = 0;
        second_term = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        for(int i=2 ; i<=n ; i++)
        {
            third_term = first_term+second_term;
            first_term = second_term;
            second_term = third_term;
            System.out.print(third_term+", ");
        }
    }
}
