# Array-4

## Problem1 Array partition I (https://leetcode.com/problems/array-partition-i/)

//T.C O(nlogn)
//S.C o(1)
class Solution {
public int arrayPairSum(int[] nums) {
if(nums.length == 0 || nums == null) return 0;
Arrays.sort(nums);
int sum = 0;
for(int i=0; i<nums.length; i=i+2)
{
sum=sum+nums[i];
}
return sum;
}
}

## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)

//T.C O(n)
//s.c o(1)

class Solution {
public int maxSubArray(int[] nums) {

    if(nums.length == 0 || nums == null) return 0;

    int n= nums.length;
    int rSum=nums[0],max=nums[0];
    for(int i = 1; i<n; i++)
    {
        rSum=Math.max(nums[i],rSum+nums[i]);
        max=Math.max(max,rSum);
    }
        return max;
    }

}

## Problem3 Next permutation(https://leetcode.com/problems/next-permutation/)

//T.C O(n
//S.C (1)

class Solution {
public void nextPermutation(int[] nums) {
if(nums.length == 0 || nums == null) return;
int n=nums.length;
int first = -1;

        for(int i = n - 2; i >= 0; i--)
        {
            if(nums[i] < nums [i + 1])
            {
                first=i;
                break;
            }
        }

        if ( first != -1)
        {
            for(int i = n - 1; i >= 0; i--)
            {
                if(nums[i] > nums[first])
                {
                    swap(nums,i,first);
                    break;
                }
            }
        }

        reverse(nums,first + 1,n - 1);

    }

    private void swap(int[] nums,int l,int r)
    {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }

    private void reverse(int[] nums,int l, int r)
    {
        while(l<r)
        {
        swap(nums,l,r);
        l++;
        r--;
    }

    }

}
