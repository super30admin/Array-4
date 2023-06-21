53. Maximum Subarray
Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.


/*
TC = O(n) - Also give the exact indices. 
SC = O(1)
*/

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        int cursum = nums[0];
        int maxsum = nums[0];
        int start = 0; int end = 0; // start and end index of the array 
        int cursumstart = 0; 
        
        for (int i=1;i<nums.size(); i++) {
            cursum = cursum+nums[i];
            if (cursum < nums[i]) { 
                cursum = nums[i];
                cursumstart = i; 
                // update the start idx when cursum becomes less than the number itself. 
            }
            //cursum = max((cursum+nums[i]), nums[i]);

            if (maxsum < cursum) {
                maxsum = cursum;
                start = cursumstart; // cursumstart doesnt change
                end = i; // i changes to the end of the array. 
            }


            //maxsum = max(cursum , maxsum);
        }
        return maxsum;
    }
};
