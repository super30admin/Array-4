//Time Complexity- O(n)
//Space Complexity- O(1)

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max=INT_MIN,max_so_far=0;
        
        for(int i=0;i<nums.size();i++){
            max_so_far=max_so_far+nums[i];
            if(max_so_far>max)
                max=max_so_far;
            if(max_so_far<0)
                max_so_far=0;
        }
        return max;
    }
};