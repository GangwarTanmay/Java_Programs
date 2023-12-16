/*

 */
package Binary_Search;

public class TargetInRotatedArray {

    static int findTarget(int [] a, int target)
    {
        int start = 0;
        int end = a.length-1;
        int ans;

        while(start<=end)
        {
            int mid = start + ((end-start)/2);
            if(a[mid] == target)
            {
                return mid;            // target is at mid index
            }

            else if(a[mid]<a[end])
            {
                if(target > a[mid] && target <= a[end])
                {
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }

            else {
                if(target >= a[start] && target<a[mid])
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
        int [] a = {9,10,11,12,1,2,3,4,5,6,8};
        int target = 8;
        System.out.println(target+" is at "+findTarget(a,target)+" index.");
    }
}
