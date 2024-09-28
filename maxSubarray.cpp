// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// P.S. code contains finding the subarray as well in addition to max

// Your code here along with comments explaining your approach
// 1. Traverse through array and maintain rSum and global max
// 2. If curr el is greater than rSum + curr el, update rSum to curr element. If rSum exceeds max then assign start and end ptrs to curr ele
// 3. Else if curr el is less than rSum + curr el, update rSum to rSum+curr el. If rSum exceeds max then just move end to curr el.

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if(!nums.size())
            return 0;
        // doing it with just 2 variables instead of dp array
        
        for(int i=0;i<nums.size();i++){ 
         // better to use only curr num as rSum 
            if(nums[i]>rSum+nums[i]){
                rSum=nums[i];
                // new maxx found, update maxx as well as start and end to this number
                if(rSum>maxx){
                    maxx=rSum;
                    start=i; end=i;    
                }
            }
            // better to continue running sum
            else{
                rSum+=nums[i];
                // new maxx found, update maxx and only end this time since old start is continued
                if(rSum>maxx){
                    maxx=rSum;
                    end=i;    
                }
            }
         }
        for(int i=start;i<=end;i++)
            cout<<nums[i]<<" ";
        return maxx;
    }
};