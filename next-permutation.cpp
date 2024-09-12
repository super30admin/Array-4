//Time - O(n)
//Space - O(1)
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        
        int i = nums.size()-1;
        for(;i>0;i--){
            if(nums[i]>nums[i-1]){
                reverse(nums.begin()+i,nums.end());
                break;
            }
        }
        if(i==0) reverse(nums.begin(),nums.end());
        else{
            int idx = i-1;
            for(;i<nums.size();i++){
                if(nums[i]>nums[idx]){
                    swap(nums[i],nums[idx]);
                    break;
                }
            }
        }
    }
};