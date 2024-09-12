//Time Complexity : O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int sum =nums[0];
        for(int i=1; i<nums.size(); i++){
            if(i%2==0){
                sum+=nums[i];
            }
        }
        
        return sum;
    }
};