package ProblemsOnRecursion.Strings;

import java.util.Scanner;

public class printSubsequences {
    static void print(String s, String answer)
    {
        if(s.length() == 0)
        {
            System.out.println(answer);
            return;
        }

        char currentChar = s.charAt(0);
        String remainingString = s.substring(1);

        // currentChar choose to present in answer
        print(remainingString,answer+currentChar);

        // currentChar choose to not present in answer
        print(remainingString,answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s = sc.nextLine();
        print(s,"");
    }
}
