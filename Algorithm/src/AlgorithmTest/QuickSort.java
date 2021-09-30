package AlgorithmTest;

public class QuickSort {
    public static void main(String[] args) {

    }
    public static void quicksort(int[] arr,int left,int right)
    {
        int l=left,r=right;
        int pivot = arr[(l+r)/2];
        int temp;
        while (l<r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            if (arr[l] == pivot) {
                r--;
            }
            if (arr[r] == pivot) {
                l++;
            }
        }
            if (l==r)
            {
                l++;
                r--;
            }
            if(left<r)
            {
                quicksort(arr,left,r);
            }
            if(right>l)
            {
                quicksort(arr,l,right);
            }
        }
}
