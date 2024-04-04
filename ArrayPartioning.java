

/**
This Java solution aims to maximize the sum of the minimum of pairs by sorting the input array.
 It iterates through the sorted array in steps of 2, summing up every alternate element, which corresponds to the minimum element of each pair. 
 Time Complexity: O(n log n) due to sorting,
 Space Complexity: O(1) as no extra space is used apart from the input array.
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum =0;
        for(int i=0;i<n;i = i+2){
            sum += nums[i];
        }
        return sum;
    }
}
