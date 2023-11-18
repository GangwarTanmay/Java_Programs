package ProblemsOnRecursion.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequences {
    static ArrayList<String> sub(String s)
    {
        ArrayList<String> ans = new ArrayList<>();

        //base case
        if(s.length()==0)
        {
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);
        ArrayList<String> smallAns = sub(s.substring(1));    // smallAns will store the subsequences of sub-problem
        for (String ss:smallAns) {

            // add all elements of smallAns to ans
            ans.add(ss);   // first character not present ["bc"]
            ans.add(curr+ss);  // first character present ["abc"]
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String s = sc.nextLine();
        long start = System.nanoTime();
        ArrayList<String> ans= sub(s);
        long end = System.nanoTime();
        float time = (float)(end - start)/1000000;
        System.out.println(ans);
        System.out.println("Time taken : "+time+" milliseconds");
    }
}
