//time complexity:O(n)
//space complexity:O(1)
//executed on leetcode: yes
//approach:using the property of permutation
//any issues faced? no

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        
        int k=nums.size()-2;
        while(k>=0 && nums[k]>=nums[k+1])
            k--;
        if(k==-1)
        {
            reverse(0,nums.size()-1,nums);
            return;
        }
        for(int i=nums.size()-1; i>k; i--)
        {
            if(nums[i]>nums[k])
            {
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                break;
            }
        }
        reverse(k+1,nums.size()-1,nums);
    }
    void reverse(int l, int r, vector<int>& nums)
    {
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
};