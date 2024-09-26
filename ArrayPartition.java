// O(n log n) time complexity: sort function is O(n log n), while loop is O(n)
// O(1) space

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // sort in ascending order
        int i = 0;
        int sum = 0;
        while (i < nums.length){
            sum += nums[i];
            i = i+2;
        }
        return sum;
    }
}