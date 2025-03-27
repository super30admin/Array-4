// Problem1 Array partition (https://leetcode.com/problems/array-partition/)

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, take min element and max element and maintain element and its frequency in hashmap. Iterate from min to max and have flag as true
 * initially to take smaller element intially to result. If flag is false decrease count of map.get(i) by 1 and make flag as true. In all
 * other cases take addedCount as map.get(i)+1/2 this takes care of all odd and even cases, add addedCount*i to result ad make flag as 
 * map.get(i)%2==0. Finally return result.
 */
// 1
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i< nums.length;i+=2){
            result +=nums[i];
        }
        return result;
        
    }
}
//2
class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int seen = 0; //keeps track of the number of elements seen
        for(int i = min; i <= max; i++){
            if(!map.containsKey(i)) continue;

            if(seen % 2 != 0) {
                // skip first occurance
                map.put(i, map.get(i) - 1);
                seen += 1;
            }
            int count = map.get(i);
            int addCount;
            if(count % 2 == 0){
                addCount = count/2;
            } else {
                addCount = count/2 + 1;
            }
            result += addCount * i;
            seen += count;
        }
        return result;
    }
}
// 3
class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        boolean flag = true; //keeps track of the number of elements seen
        for(int i = min; i <= max; i++){
            if(!map.containsKey(i)) continue;

            if(!flag) {
                // skip first occurance
                map.put(i, map.get(i) - 1);
                flag = true;
            }
            int added_count = (map.get(i)+1)/2;
            result += added_count * i;
            flag = map.get(i)%2==0;
        }
        return result;
    }
}
