import java.util.HashMap;


//Time Complexity:0(n)
//Space Complexity:0(n)

public class problem1 {
    public int arrayPairSum(int[] nums) {
        int n= nums.length;
        int result=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            min= Math.min(min, nums[i]);
            max= Math.max(max, nums[i]);

        }
        boolean flag= false;
        for (int i=min;i<=max;i++)
        {
            if (!map.containsKey(i))
            {
                continue;

            }
            if (flag)
            {
                map.put(i, map.get(i)-1);
                flag= false;
            }
            int freq= map.get(i);
            if (freq%2==0)
            {
                result+=freq/2*i;
            }
            else {
                result+=freq/2*i;
                result+=i;
                flag= true;
            }
        }
        return result;
    }
}
