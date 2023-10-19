// Problem to check whether a string is palindrome
package ProblemsOnRecursion.Strings;

public class checkPalindrome {
    static boolean check(String str, int start, int end)
    {
        if(start<end)
            return false;

        if(str.charAt(start)!=str.charAt(end))
        {
            return false;
        }
        else {
            return check(str, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(check("level",0,4));
    }
}
