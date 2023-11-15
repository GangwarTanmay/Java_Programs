// Problem to check whether a string is palindrome
package ProblemsOnRecursion.Strings;

import java.util.Scanner;

public class checkPalindrome {
    static boolean check(String str, int start, int end)
    {
        if(start>=end)
            return true;

        if(str.charAt(start)!=str.charAt(end))
        {
            return false;
        }
        return check(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String s = sc.nextLine();
        if(check(s,0,s.length()-1))
        {
            System.out.println(s+" is a palindrome string.");
        }
        else
        {
            System.out.println(s+" is not a palindrome string.");
        }
    }
}
