package AlgorithmTest;

public class MergertSort {
    public static void main(String[] args) {

    }
    public static void mergeSort(int [] arr,int left,int right,int[] temp)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right,int [] temp)
    {
            int i=left,j=mid+1,t=0;
            while (i<=mid&&j<=right)
            {
                if (arr[i] < arr[j])
                {
                    temp[t++] = arr[i];
                    i++;
                }else {
                    temp[t++] = arr[j];
                    j++;
                }
            }
            while (i<=mid)
            {
                temp[t++] = arr[i];
                i++;
            }
            while (j<=right)
            {
                temp[t++] = arr[j];
                j++;
            }
            int arrl = left;
            int t1 = 0;
            while (arrl<=right)
            {
                arr[arrl++] = temp[t1++];
            }
    }
}
