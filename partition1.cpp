// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//1. Sort the array to get minimum distance between consecutive elements
//2. Calculate the sum by going through the first elements
//3. Return result
class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        //edge
        if(nums.size()==NULL)
            return 0;
        
        //logic
        sort(nums.begin(), nums.end());
        int result=0;
        for(int i=0; i<nums.size();i=i+2){
            result+=nums[i];
        }
        return result;
    }
};
