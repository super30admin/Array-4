//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        if(nums.size()==1 || nums.size()==0) return;
        //find index where nums[i] is less than the next num
        int idx1=-1;
        for(int i=nums.size()-1; i>0; i--){
            if(nums[i-1]<nums[i]){
                idx1 = i-1;
                break;
            }
        }
        
        
        //check for immediate greater number than nums[idx1] and swap it 
        if(idx1>=0){
            for(int i=nums.size()-1; i>=0; i--){
                if(nums[i]>nums[idx1]){
                    int temp = nums[i];
                    nums[i] = nums[idx1];
                    nums[idx1] = temp;
                    break;
                }    
            }
            
        }
        
        
        //reverse the numbers from idx1+1 to end of the array
        int st = idx1+1;
        int end = nums.size()-1;
        while(st<=end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;end--;
        }
    }
};