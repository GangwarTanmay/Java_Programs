// Program to search element in rotated sorted array with duplicate elements. Return index of target element if found, else return -1.
package Binary_Search;

public class findTarget {

    static int search(int [] a, int target)
    {
        int start = 0;
        int end = a.length - 1;

        while(start<=end)
        {
            int mid = start+((end-start)/2);
            if(a[mid] == target)
            {
                return mid;
            }
            else if(a[start] == a[mid] && a[end] == a[mid])
            {
                start++;
                end--;
            }
            else if(a[mid]<=a[end])
            {
                if(target>a[mid] && target <= a[end])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }

            else {
                if(target>=a[start] && target <a[mid])
                {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        System.out.println("Found at : "+search(a,target));
    }
}
