package AlgorithmTest;

public class BinarySearchNoRecur {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,4,7,8,15};
        System.out.println(BinarySearch(a,15));
    }
    public static int BinarySearch(int [] a,int targe)
    {
        int right = a.length-1,left = 0;
        int mid;
        while(right>=left)
        {
            mid = (right+left)/2;
            if(a[mid]==targe) return mid;
            else if(a[mid] > targe)
            {
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
