# Array-4

## Problem1 Array partition (https://leetcode.com/problems/array-partition/)
## Time and Space:O(n)
class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }

        boolean flag=false;
        for(int i=min;i<=max;i++)
        {  
            if(!map.containsKey(i)) continue;
            
            if(flag){
               map.put(i,map.get(i)-1);
               flag=false; 
            }
            int frq=map.get(i);
            if(frq%2==0)
            {
                result+=frq/2 * i;
            }
            else{
                result+=frq/2 * i;
                result+=i;
                flag=true;
            }
        }
        return result;
    }
}
## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
## Time :O(n) Space:O(1)
class Solution {
    public int maxSubArray(int[] nums) {

      
    int maxSum = nums[0];  
        int currentSum = nums[0];  

        for (int i = 1; i < nums.length; i++) {
            
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;

     
    }
}
## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)
## Time:O(n) Space:O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }

        if(i>=0)
        {
            int j=n-1;
            while(nums[i]>=nums[j])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);

    }
    private void swap(int[] nums,int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    private void reverse(int[] nums,int i,int j)
    {
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}