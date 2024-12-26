//53. Maximum Subarray - https://leetcode.com/problems/maximum-subarray/description/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSubArrSum = nums[0];
        int maxSubArrSum = nums[0];

        for(int i=1; i<n; i++){
            currSubArrSum = Math.max(currSubArrSum+nums[i], nums[i]);
            maxSubArrSum = Math.max(maxSubArrSum, currSubArrSum);
        }

        return maxSubArrSum;
    }
}

//To keep the track of the indices
class Solution {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSubArrSum = nums[0];
        int maxSubArrSum = nums[0];
        int start = 0, end = 0;
        int currStart = 0;

        for(int i=1; i<n; i++){
            if(currSubArrSum+nums[i] < nums[i]){
                currStart=i;
            }
            currSubArrSum = Math.max(currSubArrSum+nums[i], nums[i]);
            if(maxSubArrSum < currSubArrSum){
                start = currStart;
                end = i;
            }
            maxSubArrSum = Math.max(maxSubArrSum, currSubArrSum);
        }
        System.out.println("start: " + start +" "+ ", end: " + end);
        return maxSubArrSum;
    }
}
