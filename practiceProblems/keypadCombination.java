package practiceProblems;

import java.util.Scanner;

public class keypadCombination {
    static void combination(String s, String [] kp, String res)
    {
        if(s.length()==0)
        {
            System.out.print(res+" ");
            return;
        }
        char c = s.charAt(0);
        s = s.substring(1);
        int current = c-'0';
        String comb = kp[current];

        for(int i=0 ; i<comb.length() ; i++)
        {
            combination(s,kp, res+comb.charAt(i));
        }
    }

    public static void main(String[] args) {
        String [] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combination("23",kp,"");
    }
}
