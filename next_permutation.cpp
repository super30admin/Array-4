//Time Complexity-O(n)
//Space Complexity-O(1)
//Ran successfully on leetcode
class Solution {
public:
    void nextPermutation(vector<int>& nums){
        if(nums.empty() || nums.size()==1)
            return;
        //find the greater number position
        int i=nums.size()-1;
        int pos;
        while(i>0)
        {
            if(nums[i]>nums[i-1])
            {
                pos=i-1;
                break;
            }
            i--;
        }
        //swap the next lowest number with pos
        int j;
        for(j=nums.size()-1;j>=i;j--)
        {
            if(nums[j]>nums[pos])
            {
                swap(nums[j],nums[pos]);
                break;
            }            
        }
        int last=nums.size()-1;
        int first=i;        
        //reverse from i to size-1
        while(first<=last)
        {
            swap(nums[first],nums[last]);            
            first++;
            last--;
        }
    }
};