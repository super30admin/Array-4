//Time-O(n)
//Space-O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<2)
            return;
        int i = nums.length-1;
        int j = nums.length-2;
        int toReplace = 0;
        while(i>0){
            if(nums[j]>=nums[i])
            {
                j--;
                i--;
            }else{
                toReplace = j;
                break;
            }
        }
        if(i==0){
            reverse(nums,0,nums.length-1);
        }else{
            for(int k=nums.length-1;k>=0;k--){
                if(nums[k]>nums[toReplace]){
                    int temp = nums[k];
                    nums[k]=nums[toReplace];
                    nums[toReplace] = temp;
                    reverse(nums,toReplace+1,nums.length-1);
                    break;
                    
                }
            }
        }
    }
    private void reverse(int[] nums,int i , int j){

        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
