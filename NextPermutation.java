/*
TC: O(N)
SC: O(1)
 */
class NextPermutation{

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = nums.length-2;
        while(k >= 0 && nums[k]>= nums[k+1]){
            k--;
        }

        if (k == -1){
            reverse(nums,0,n-1);
            return;
        }

        for (int i = n-1; i >= 0; i--){
            if (nums[i] > nums[k]){
                swap(nums,i,k);
                break;
            }
        }

        reverse(nums,k+1,nums.length-1);
    }

    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}