O(N) time, O(1) space
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        //find breach
        //First element <= elements on right side
        int i = nums.size()-2;
        while(i>=0 && nums[i] >= nums[i+1]){
          i--;
        }
        //if there is breach, replace, reverse
        if(i>=0){
            int j = nums.size()-1;
            //first number >= breach number
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        //no breach - only reverse
        reverse(nums,i+1,nums.size()-1);
    }
    
    void reverse(vector<int>& nums, int l, int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    
    void swap(vector<int>& nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
};
