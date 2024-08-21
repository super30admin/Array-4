/*
TC --> O(n)
SC --> O(1)
*/
class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1;
        int ind2 = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1 = i;
                break;
            }
        }//for

        if(ind1==-1){
            reverse(nums, 0);
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2 = i;
                    break;
                }
            }//for
            swap(ind1, ind2, nums);
            reverse(nums, ind1+1);
        }//else
        
    }
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }//while
    }
}