/*
Given an array of positive and negative integers, separate them in linear time. The output should print all negative numbers followed by
all positive numbers.
input : a[] = {19, -20, 7, -4, -13, 11, -5, 3}
output : a[] = {-20, -4, -13, -5, 7, 11, 19, 3}
 */
package SortingAlgorithms;

public class problem3 {

    static void separate(int [] a)
    {
        int l = 0;
        int h = a.length-1;

        while(l<h)
        {
            while(l<h && a[l]<0)
            {
                l++;
            }

            while(l<h && a[h]>=0)
            {
                h--;
            }

            int temp = a[l];
            a[l] = a[h];
            a[h] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        separate(arr);

        for(int element : arr)
        {
            System.out.print(element+" ");
        }
    }
}
