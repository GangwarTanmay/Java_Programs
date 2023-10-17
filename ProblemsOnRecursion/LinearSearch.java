// Program to perform linear search using recursion
package ProblemsOnRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

    // Method to return an arraylist containing all the index where searched element is found
    static ArrayList<Integer> allIndexes(int a[], int ind, int ele)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(ind==a.length)
            return ans;   // return empty arrayList, if no index found

        if(a[ind]==ele)
        {
            ans.add(ind);
        }
        ans.addAll(allIndexes(a,ind+1,ele));    // here remaining indexes will be stored in arrayList.
        // allIndexes() return an ArrayList, so we used addAll() method to add all indexes.
        return ans;
    }

    // Method to perform all the index where searched element is found
    static void printAllOccurrences(int a[], int ind, int ele)
    {
        if(ind==a.length) {
            return;
        }

        if(a[ind]==ele)
        {
            System.out.print(ind+" ");
        }
        printAllOccurrences(a,ind+1, ele);
    }

    // Method to perform linear search in the given array
    static boolean Search(int a[], int ind, int ele)
    {
        if(ind==a.length)
            return false;

        if(a[ind]==ele)
        {
            return true;
        }
        else {
            return Search(a,ind+1, ele);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int l = sc.nextInt();

        int a[] = new int[l];
        System.out.println("Enter array elements : ");
        for(int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched : ");
        int ele = sc.nextInt();

       // System.out.println("Element present : "+Search(a,0,ele));

        /*
        System.out.print("Occurrence of "+ele+" is at indexes : ");
        printAllOccurrences(a,0,ele);
         */

        ArrayList<Integer> list = allIndexes(a,0,ele);
        System.out.println(list);
    }
}
