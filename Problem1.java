// Time Complexity - O(n * logn) where n is the length of the nums array. the time complexity is (nlogn+n) where nlogn for sorting the nums array and n for traversing through the array to process it's elements for maximum sum. 
// Space Complexity - O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        int sum =0;
        if(nums == null || nums.length ==0) return sum;     // if nums array is empty return 0 sum
        Arrays.sort(nums);                             // Sort the array
        for(int i=0;i < nums.length;i=i+2){     // Increment i by 2 to get the first element of each pair
            sum += nums[i];             // Add the first element of every pair which would be the minimum of the two since the array is sorted
        }
        return sum;
    }
}
