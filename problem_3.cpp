//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if(nums.size()==0) return;
        int i = nums.size()-2 ;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        int j = nums.size()-1;
        if(i>=0){
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.size()-1);
    }
    void swap(vector<int>& nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(vector<int>& nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
};