// Program to check whether an array is sorted or not, using recursion
package ProblemsOnRecursion;

import java.util.Scanner;

public class CheckSorted {
static boolean check(int a[], int ind)
{
    if(ind==a.length)
    {
        return false;
    }

    if(a[ind]<a[ind+1])
    {
        return true;
    }
    return check(a,ind);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {9,2,3,4,5};

        System.out.println(check(a,0));
    }
}
