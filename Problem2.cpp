// Time Complexity : O(N) #of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 


// Your code here along with comments explaining your approach:
// 1. Traverse array and check if we add current element to total summ till it will it be positive. 
// 2. If its positive it adds value to our max sub array hence add it and check if its max.
// 3. Else start sub array with next positive element.

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int cur_sum=INT_MIN,max=INT_MIN,n=nums.size();
        for(int i=0;i<n;i++){
            int t;
            if(cur_sum!=INT_MIN){t=cur_sum+nums[i];}else{t=nums[i];}
            if(t>nums[i]){cur_sum=t;}else{cur_sum=nums[i];}
            if(cur_sum>max){max=cur_sum;}
        }
        return max;
    }
};