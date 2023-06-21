//leetcode.com/problems/next-permutation
//TC : o(n)
//SC : o(1)


class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //1 - find breach 
        int i;
        for(i=n-2 ; i>=0 ; i--){
            if(nums[i] < nums[i+1]){
                break;
            }
        }
        //2 - swap with number just greater
        if(i>=0){
            for(int j=n-1;j>=0;j--){
                if(nums[j]>nums[i]){
                    swap(nums,i,j);
                    break;
                }
            }
        }
        //3 - reverse the number from i+1 index
        reverse(nums,i+1,n);
    }
    private void swap(int[] nums,int i, int j){
        if(i == j) return;
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
    private void reverse(int[] nums, int i, int n){
        int pt1 = i;
        int pt2 = n-1;
        while(pt1<pt2){
            swap(nums,pt1,pt2);
            pt1++;
            pt2--;
        }
    }
}
