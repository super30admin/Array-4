class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int len=nums.size();
        int i;
        for(i=len-1;i>0;i--)
        {
           if(nums[i-1]<nums[i])
            break;
        }
        
        if(i==0)
        {
            sort(nums.begin(),nums.end());
           
            return;
        }
        
        int smallest=i,x=nums[i-1];
        for(int j=i+1;j<len;j++)
        {
            if(nums[j]>x && nums[j]<nums[smallest])
                smallest=j;
        }
        
        swap(nums[i-1],nums[smallest]);
        
        sort(nums.begin()+i,nums.end());
        
       
        
    }
};