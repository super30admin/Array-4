//Time Complexity- O(n)
//Space Complexity- O(1)

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        
        int i=(int)nums.size()-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        
        int j=(int)nums.size()-1;
        if(i>=0){
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
        }
        
        if(i>=0 && j>=0){
            swap(nums[j],nums[i]);
        }
        reverse(nums,i+1);
    }
    
    void reverse(vector<int> &nums,int index){
        
        int end=(int)nums.size()-1;
        while(index<=end){
            swap(nums[index],nums[end]);
            index++;
            end--;
        }
    }
};