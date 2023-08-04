package problems.arrays;

import java.util.Arrays;

public class Problem31 {
//TC=O(n)
//SC=(1)
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<2)
            return;
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){ //finding breach i.e where previous number is less than the current number
            i--;
        }
        int j=n-1;
        if(i>=0){
            while(nums[i]>=nums[j])
                j--;
            swap1(nums,i,j);
        }

        reverse(nums, i+1, n-1);
        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[] nums, int l, int r){
        while(l<=r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    private void swap1(int[] nums, int i, int j){
        if(i!=j){
            nums[i]=nums[i]+nums[j];
            nums[j]=nums[i]-nums[j];
            nums[i]=nums[i]-nums[j];
        }

    }
    public static void main(String[] args) {
        Problem31 problem=new Problem31();
        problem.nextPermutation(new int[]{3,2,1});
    }
}
