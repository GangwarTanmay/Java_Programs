/*
Program to find the sum of subsets of array
example -

input: [4,5]
output : 4,5,9,0
explanation : subsets of [4,5] = {[], [4], [5], [4,5]}
              sum = {0, 4, 5, 9}

input: [2,4,5]
output : 11,6,7,2,9,4,5,0
explanation : subsets of [2,4,5] = {[2,4,5], [2,4], [2,5], [2], [4,5], [4], [5], [],}
              sum = {11, 6, 7, 2, 9, 4, 5, 0}

 */

package ProblemsOnRecursion;

import java.util.Scanner;

public class ArraySubsetsSum {
    static void subsets(int arr[], int ans, int ind)
    {
        if(ind>=arr.length)
        {
            System.out.println(ans);
            return;
        }
        int currElement = arr[ind];
        subsets(arr, ans+currElement, ind+1);
        subsets(arr,ans, ind+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {2,4,5};
        subsets(a, 0, 0);
    }
}

