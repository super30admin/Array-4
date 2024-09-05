// class Solution {
//     public int arrayPairSum(int[] nums) {
//         int result = 0;
//         Arrays.sort(nums);
//         for(int i=0; i < nums.length; i=i+2) {
//             result += nums[i];
//         }
//         return result;
//     }
// }
//Time Complexity : O(n) + O(max(n))
//Space Complexity : O(n)
//Did this code run successfully on leetcode : Yes
//Have you faced any issue while coding this problem : No
class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        boolean flag = false;
        for(int i = min; i <=max; i++) {
            if(map.containsKey(i)) {
                if(flag) {
                    map.put(i, map.get(i)-1);
                }
                int count = map.get(i);
                int pairs = count/2;
                result += pairs*i;
                if(count % 2 == 0) {
                    flag = false;
                } else {
                    result += i;
                    flag = true;
                }
            }
            
        }
        return result;
    }
}