//Time Complexity:O(N)
//SPace Complexity:O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==0 || nums==null)
        {
            return;
        }
        // discover element which is smaller than right
        int i=nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if(i!=-1)
        {
            int j=nums.length-1;
            while(j>=0&&nums[j]<=nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

 private void reverse(int[] nums, int i, int j){

        while(i<j){

            swap(nums,i,j);

            i++;

            j--;

        }
 }

    private void swap(int[] nums,int i, int j){

        int temp=nums[i];

        nums[i]=nums[j];

        nums[j]=temp;

    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,3};
        Solution s= new Solution();
        s.nextPermutation(nums);
    }

}