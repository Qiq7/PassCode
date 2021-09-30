package javaxm3.sbww;
//over#659
import java.util.HashMap;

public class MyLeetCode0028 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,4,5};
        System.out.println(isPssible(a));
    }
    public  static boolean isPssible(int[] nums)
    {
        HashMap<Integer,Integer> cout=new HashMap<>();
        //int[] e=new int[nums.length];
        HashMap<Integer,Integer> e=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            cout.put(nums[i],cout.getOrDefault(nums[i],0)+1);
            //e.put(nums[i],0);
        }
        int x,x1,x2,y;
        for (int i:nums) {
            x=cout.get(i);
            y=e.getOrDefault(i-1,0);
            if(cout.get(i)==0) continue;
            else if (y>0)
            {
                cout.put(i,--x);
                e.put(i-1,--y);
                e.put(i,e.getOrDefault(i,0)+1);
            }else if(x>0&&cout.getOrDefault(i+1,0)>0&&cout.getOrDefault(i+2,0)>0)
            {
                cout.put(i,--x);
                cout.put(i+1,cout.getOrDefault(i+1,0)-1);
                cout.put(i+2,cout.getOrDefault(i+2,0)-1);
                e.put(i+2,e.getOrDefault(i+2,0)+1);
            }else
            {
                return false;
            }
        }
//        for (int a:cout.keySet()) {
//            System.out.println(a+"   "+cout.get(a));
//        }

        return true;
    }
}
