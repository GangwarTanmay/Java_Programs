//Program to find first element repeating in an array
package ArrayProblems;

import java.util.Scanner;

public class firstAndLastRepeat {
    static int findLastRepeatingElement(int a[])
    {
        int lastRepeating = -1;
        for(int i=0 ; i<a.length ; i++)
    {
        for(int j=i+1 ; j<a.length ; j++)
        {
            if(a[i] == a[j])
            {
                lastRepeating = a[i];
            }
        }
    }
        return lastRepeating;

    }

    static int findFirstRepeatingElement(int a[])
    {
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j=i+1 ; j<a.length ; j++)
            {
                if(a[i] == a[j])
                {
                    return a[i];
                }
            }
        }
        return -1;   // when if condition will not be executed then -1 will be returned
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Enter array elements.");
        for(int i=0 ; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int first_ele = findFirstRepeatingElement(arr);
        System.out.println("First Repeating element is "+ first_ele);

        int last_ele = findLastRepeatingElement(arr);
        System.out.println("Last Repeating element is "+last_ele);
    }
}
