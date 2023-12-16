package Binary_Search;

public class MinInRotatedArray {
    static int findMin(int [] a)
    {
        int n = a.length;
        int start = 0;
        int end = n-1;
        int ans=-1;

        while(start<=end)
        {
            int mid = start + ((end-start)/2);
            if(a[mid] > a[n-1])
            {
                start = mid+1;
            }
            else {
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //int [] a = {9,10,11,12,1,2,3,4,5,6,7,8};
        int [] a = {4,5,1,2,3};
        System.out.printf("Index of minimum element = %d",findMin(a));
    }
}
