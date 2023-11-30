// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class Arraypartition {
    class Solution {
        public int arrayPairSum(int[] nums) {
            //Arrays.sort(nums);
            int n = nums.length;
            int result = 0;

            // for(int i = 0; i < n; i = i+2){
            //     result += nums[i];
            // }

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int num : nums){
                pq.add(num);
            }

            while(!pq.isEmpty()){
                result += Math.min(pq.poll(), pq.poll());
            }

            return result;
        }
    }
}
