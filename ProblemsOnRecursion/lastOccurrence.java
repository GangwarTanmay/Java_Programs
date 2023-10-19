// Program to find the last occurrence of the target
package ProblemsOnRecursion;

import java.util.Scanner;

public class lastOccurrence {
    static int lastIndex(int arr[], int ind, int target)
    {
        if(ind==-1)
            return -1;

        if(arr[ind] == target)
        {
            return ind;
        }

        return lastIndex(arr,ind-1,target);
    }

    public static void main(String[] args) {
        int [] a = {1,3,2,5,3,8,1};
        System.out.println("Last occurrence is a index : "+lastIndex(a,a.length-1,1));
    }
}
