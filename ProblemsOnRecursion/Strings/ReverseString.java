package ProblemsOnRecursion.Strings;

import java.util.Scanner;

public class ReverseString {
    static String Reverse(String s, int ind)
    {
        if(ind<0)
            return "";

        return s.charAt(ind)+Reverse(s,ind-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = sc.nextLine();
        System.out.println("Reverse string : "+Reverse(str,str.length()-1));
    }
}
