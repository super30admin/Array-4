/*
 * tc - 0(3n)
 * sc - 0(1)
 */
public class nextPerm {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n -2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            //to identify the breach 
            i--;
        }
        if(i >= 0){
            int j = n-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i,j);
        }
        reverse(nums,i+1,n-1);
    }

    private void swap(int nums[], int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int l, int r){
        while(l < r){
            swap(nums,l,r);
            l++; r--;
        }
    }
}
