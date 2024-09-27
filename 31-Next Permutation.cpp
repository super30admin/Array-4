/*
TC = O(n)
SC = O(1)
where n is the size of the nums array.
*/
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int i,n = nums.size();
        int temp=-1;
        for(i=n-2;i>=0;i--)
            if(nums[i]<nums[i+1])
            {
                temp = i;
                break;
            }

        if(temp!=-1)
        {
            for(i=n-1;i>=0;i--)
            {
                if(nums[temp]<nums[i])
                {
                    swap(nums[temp],nums[i]);
                    break;
                }
            }
            reverse(nums.begin()+temp+1,nums.end());
        }
        else
            reverse(nums.begin(),nums.end());
    }
};
