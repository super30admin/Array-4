//Time complexity : O(n)
//Space complexity : O(1)

//Approach : Find the first mismatch where descending order breaks, from the end
        //   Once found, keep the index
        //   if mismatch is found then swap the index element with first bigger element (from the end)
        //   reverse the array from index + 1 to end

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if(nums.size() == 0)
            return;
        
        int first = -1;
        //Find the first mismatch where descending order breaks
        
        for(int i = nums.size() - 2; i >= 0 ; i--)
        {
            if(nums[i] < nums[i + 1])
            {
                first = i;
                break;
            }
        }
        
        if(first != -1)
        {
            for(int i = nums.size() - 1 ; i >= 0 ; i--)
            {
                if(nums[i] > nums[first])
                {
                    int temp = nums[i];
                    nums[i] = nums[first];
                    nums[first] = temp;
                    break;
                }
            }
        }
        
        reverse(nums.begin() + first + 1, nums.end());
    }
};