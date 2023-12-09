// Program to find first occurrence of element x in a sorted array using binary search.
package Binary_Search;

public class firstAndLastOccurrence {

    static void findLastOccurrence(int [] a, int x)
    {
        int l=0, h=a.length-1;
        int index = -1;

        while(l<=h)
        {
            int mid = l+((h-l)/2);
            if(x<a[mid])
            {
                h = mid-1;
            } else if (x>a[mid]) {
                l = mid+1;
            }
            else {
                index = mid;
                l = mid+1;       // still we need to check the occurrence of x in right sub-array
            }
        }
        System.out.printf("\nLast Occurrence of %d is at %d index.",x,index);
    }
    static void findFirstOccurrence(int [] a, int x)
    {
        int l = 0, h = a.length-1;
        int index = -1;

        while(l<=h)
        {
            int mid = l+((h-l)/2);
            if(x>a[mid])
            {
                l = mid+1;
            } else if (x<a[mid]) {
                h = mid-1;
            }
            else{
                index = mid;
                h = mid-1;    // still we check int the subarray[l, mid-1], if x occurs
            }
        }

        System.out.printf("First Occurrence of %d is at %d index.",x,index);
    }

    public static void main(String[] args) {
        int [] a = {1,1,1,1,2,2,2,3,4,6};
        int x = 2;
        findFirstOccurrence(a,x);
        findLastOccurrence(a,x);
    }
}
