//TC = O(N)
//SC = O(1)

/*
 * We try to find where the current num is lesser than the next num
 * Then we find the next biggest 
 * then we swap 
 * Since we want the smallest number, we reverse.
 */

import java.util.*;
public class NextPermutation {

    public static void NextPermutation(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return;
        }

        int n = nums.length;

        int i = n -2;

        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }

        int j = n-1;
        if(i>=0)
        {
            while(j>=0 && nums[j]<=nums[i])
            {
                j--;
            }

            swap(nums,i,j);
        }

        reverse(nums,i+1,n-1);
    }

    private static void swap(int nums[],int l, int r)
    {
        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }

    private static void reverse(int nums[],int l,int r)
    {
        while(l<=r)
        {
            int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
        }
    }


    public static void main(String args[])
    {
        int[] nums = {1,2,3};
        NextPermutation(nums);

        for(int i:nums)
        {
            System.out.print(i+" ");
        }
    }
}
