import java.util.Arrays;
import java.util.HashMap;

public class ArrayPartition {

    // Time Complexity :O(n) where n is the number of elements in the nums array
    // Space Complexity :O(1) as no auxiliary space is used
    // Did this code successfully run on Leetcode :yes
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int len = nums.length;
        int sum = 0;
        int min = 10001;
        int max = -10001;
        //create a frequency map
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i =0; i<len; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0)+1);
        }
        int i =0;
        int j = min;
        while(i<len && j<=max){
            if(frequencyMap.containsKey(j)){
                if(i%2 ==0){
                    sum += j;
                }
                frequencyMap.put(j, frequencyMap.get(j)-1);
                if(frequencyMap.get(j) == 0){
                    frequencyMap.remove(j);
                    j++;
                }
                i++;
            }else{
                j++;
            }
        }
        return sum;
    }

    // Time Complexity :O(n * logn) where n is the number of elements in the nums array
    // Space Complexity :O(1) as no auxiliary space is used
    // Did this code successfully run on Leetcode :yes
    public int arrayPairSum2(int[] nums) {

        if(nums == null || nums.length < 1){
            return 0;
        }
        int len = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(i%2 == 0){
                sum += nums[i];
            }
        }
        return sum;
    }


}
