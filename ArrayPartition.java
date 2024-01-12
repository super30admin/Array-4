//T.C O(n+k)
//S.C O(k)

import java.util.HashMap;

//Using bucket sort
class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        boolean flag = false;
        for(int i=min;i<=max;i++){
            if(map.containsKey(i)){
                if(flag){
                    map.put(i,map.get(i)-1);
                }
                int cnt = map.get(i);
                result += cnt/2*i;
                if(cnt%2==0)
                    flag = false;
                else{
                    result += i;
                    flag = true;
                }
            }
        }
        return result;
    }
}