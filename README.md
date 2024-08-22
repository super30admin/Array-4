# Array-4

## Problem1 Array partition (https://leetcode.com/problems/array-partition/)

 public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);// Sort the array so every pairs fist integer can be paired with alternaive nnumbers to produce maximum sum of the array.T.C=O(n) S.C=O(1)
        int maxi=0;
        for(int i=0;i<nums.length;i+=2){
            maxi+=nums[i];
        }
        return maxi;
    }
    
## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int rSum=nums[0];
        int maxi=nums[0];
        for(int i=1;i<n;i++){
            rSum=Math.max(nums[i],nums[i]+rSum);
            maxi=Math.max(maxi,rSum);
        }
        return maxi;
    }
}

## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null)
            return;
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            inte(nums,i,j);
        }
        inter(nums,i+1,n-1);
    }
    private void inter(int[] nums, int l, int r){
        while(l<r){
            inte(nums,l,r);
            l++;
            r--;
        }
    }
    private void inte(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}