package practiceProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Repeating_elements {
    static void repeat(int a[])
    {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<a.length ; i++)
        {
            if(ans.contains(a[i]) == true && l.contains(a[i])==false)
            {
                l.add(a[i]);
            }
            else{
                ans.add(a[i]);
            }
        }
        if(l.size()==0)
        {
            System.out.println("No repeating elements.");
        }
        System.out.println("Repeating elements : "+l);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int l = sc.nextInt();

        int [] a = new int[l];

        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l; i++)
        {
            a[i] = sc.nextInt();
        }
        repeat(a);
    }
}
