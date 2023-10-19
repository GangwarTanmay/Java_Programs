package ProblemsOnRecursion.Strings;

import java.util.Scanner;

public class RemoveCharacter {
    static String remove(String s, int ind,char target)
    {
        String str= "";
        if(ind==s.length())
            return str;

        if(s.charAt(ind)!=target)
        {
            str+=s.charAt(ind);
        }

        return str+remove(s,ind+1,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Tanmay Gangwar";
        System.out.println("Updated string : "+remove(s,0,'a'));
    }
}
