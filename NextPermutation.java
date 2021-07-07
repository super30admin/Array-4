//TC : O(n)
//SC : O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        int i = nums.length-2;


        //Find the i pointer that is not in descending order
        while(i>=0 && nums[i] >= nums[i+1]) i--;
        
        //Find the next biggest number to i
        if(i >=0){
                int j=nums.length-1;

                while(nums[i]>=nums[j]) j--;

                swap(nums,i,j);

                
        }

        //Reverse everything from i+1 to rest
       reverse(nums,i+1,nums.length-1);

    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums,int start,int end){

        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
      
    
}