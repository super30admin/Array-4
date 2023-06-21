public class NextPermutation {
    // TC - O(n) //SC O(1)
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length ==0) return ;
        int n = nums.length;
        int index =-1;

        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
                index = i;
                break;
            }
        }
        if(index!=-1){
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[index]){
                    swap(nums,i,index);
                    break;
                }
            }
        }
        reverse(nums,index+1,n-1);
    }
    private void reverse(int[] nums, int left, int right){
        while(left<=right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    private void swap(int[] nums, int first, int second){
        int temp =nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
