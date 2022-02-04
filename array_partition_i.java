class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0; //base case where if the length of nums array is 0, return 0
        int n = nums.length; //n has the length of the nums array
        int sum = 0; //we initialize a varibale named as sum to 0
        Arrays.sort(nums); //we sort the nums array
        for(int i = 0; i < n; i = i + 2) { //we go through the array
            sum += nums[i]; //we copute the sum of all the alternate elements in the array
        }
        return sum; //in the end, we return sum
    }
}
//tc and sc - O(nlog n) and O(1)