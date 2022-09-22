// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null ||nums.length == 0){
            return;
        }
        int n = nums.length;
        int idx = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx!=-1){
        for(int i=n-1;i>=0;i--){
            if(nums[i] > nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        }
        reverse(nums,idx+1,n-1);
    }
    private void reverse(int[] nums,int left,int right){
        while(left<=right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    void swap(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}