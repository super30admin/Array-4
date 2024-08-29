//Time = O(n log n), sorting function
//Space = O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) { // Iterate through the array, incrementing by 2
            sum += nums[i]; // Add every other element to the sum
        }
        return sum;
    }
}
