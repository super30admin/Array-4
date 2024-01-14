//TC : O(n)
//SC: O(n)

import java.util.HashMap;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {

      int maxSum=0;

      int small= Integer.MAX_VALUE;
      int large = Integer.MIN_VALUE;

      HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
      for( int i =0; i< nums.length; i++){

        small = Math.min(small, nums[i]);
        large = Math.max(large, nums[i]);

        if(map.containsKey(nums[i])){
          int t = map.get(nums[i]);
          map.replace(nums[i], t+1);
        }
        else{
          map.put(nums[i], 1);
        }
      }

      boolean flag = false;
      int carry =0;
      for( int i =small; i<= large; i++){

        if(map.containsKey(i)){

          if(flag == true){
            maxSum = maxSum + carry;
            int t = map.get(i);
            map.replace(i, t-1);
            flag = false;
          }

          maxSum = maxSum + (map.get(i)/2 * i);
          if(map.get(i)%2 == 1) {
            flag = true;
            carry = i;
          }
        }
      }
      return maxSum;
    }
  }
