//TC: O(nlog(n)) where n is the size of the array
//SC: O(1)

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());
        
        int minsum = 0;
        
        for(int i=0; i<nums.size(); i+=2){
            minsum += nums[i];
        }
        
        return minsum;
        
    }
};