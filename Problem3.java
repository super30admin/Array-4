//Time: O(N)
//Space: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1)
            return;
        int temp;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                int j;
                for(j =nums.length-1;j>=0;j--)
                    if(nums[j] > nums[i])
                        break;


                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                reverse(nums, i+1, nums.length-1);
                return;
            }

        }

        reverse(nums, 0, nums.length-1);
    }

    public void reverse(int []nums, int start, int end){
        int temp;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}