// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    public void nextPermutation(int[] nums) {
        //edge case
      if(nums == null || nums.length==0)
          return;
        int n = nums.length;
        int i= n-2; // start checking at second last value
       
        //finding breach
        while(i>=0 && nums[i] >= nums[i+1]) // if value is greater than next...keep moving
            i--; // we stop when we find a breach i.e  value at i is less than next value
        
        //find element to be swapped
        int j=n-1; 
        
        if(i>=0) // till i is present i.e there is a breach
        {
            while(nums[i]>=nums[j]) // reach the point where the value is just greater than value at i
            {
                    j--;
            }
            swap(nums,i,j); // swap the two values
        }
        reverse(nums,i+1,n-1); // reverse the rest of the values
      
    }
    
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
     private void reverse(int[] nums, int i, int j)
     {
         while(i<j)
         {
             swap(nums,i,j);
             i++;
             j--;
         }
     }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


class Solution {
    public int maxSubArray(int[] nums) {
        //edge case
        if(nums==null || nums.length==0)
            return 0;
        int local = nums[0]; // initial value as local
        int global = nums[0]; // initial value as global
        
    for(int i=1;i<nums.length;i++) // start from 2nd value
    {
        local = Math.max(nums[i], local+nums[i]); // find local maximum as the sum till the point or if we consider the value alone and start from there
        global = Math.max(global, local); // update global maximum based on local maximum value
    }
        return global;
    }
}

// storing the indices of the maximum subarray

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int k=0; // start of local max
        int start=0; // start of global max
        int end = 0; // end of global max
        int local = nums[0];
        int global = nums[0];
        
    for(int i=1;i<nums.length;i++) // iterate over the array
    {
        if(nums[i] > local+ nums[i]) // if the num alone is better than considering the previous sum with curr
        {
            local = nums[i]; // set local as current value
            k = i; // reset k to i as local max will start from here
        }
        else
        {
            local = local+ nums[i]; // set local to previous sum and current value
        }
        
        if(local>global) // if we have a better local sum
        {
            global = local; // update the global
            start = k; // update start and end of global maximum found
            end = i;
        }
    }
        
        return global;
    }
}

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // sort the elements
        int sum = 0;
        for(int i=0;i<nums.length;i=i+2) // consider every 1st element in a pair as they have the lease distance 
        {
            sum += nums[i];
        } 
        return sum;
    }
}