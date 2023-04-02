public class NextPermutation {
    //TC=O(n) SC=O(1)
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(nums==null||nums.length==0)return;
        int i=n-2;
        //Step1:breach
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i!=-1){
            int j=n-1;
            //Step2:find elem greate than i from behind
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private void reverse(int[] nums,int l,int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }

    private void swap(int[] nums,int i,int j){
        if(i!=j){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
}
