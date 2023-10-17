/* Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each element of array sorted
 in non-decreasing order using approach of two pointers.
  for e.g., 1. a[] = {1,2,3,4}
               answer[] = {1,4,9,16}

            2. a[] = {-10,-4,-2,-1}
               answer = {100,16,4,1}  x
               answer = {1,4,16,100}  ✓
  */

package ProblemsOnArray;

import java.util.Scanner;

public class SqaureArray {

    static void reverse(int a[])
    {
        int start=0, end=a.length-1;
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static int [] squareArray (int a[])
    {
        int answer[] = new int[a.length];
        int start=0, end=a.length-1;
        int i=0;
        while(start<=end)
        {
            if(Math.abs(a[start])>Math.abs(a[end]))
            {
                answer[i] = a[start] * a[start];
                start++;
                i++;
            }
            else{
                answer[i] = a[end] * a[end];
                end--;
                i++;
            }
        }
        return answer;
    }

    static void print(int a[])
    {
        reverse(a);
        for(int i=0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l = sc.nextInt();
        int a[] = new int[l];

        System.out.println("Enter array elements : ");
        for (int i=0 ; i<l ; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Non-decreasing array after squaring each element of array : ");
        int [] answer = squareArray(a);
      //  reverse(answer);
        print(answer);
    }
}
