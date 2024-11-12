// Array-4

// Problem1 Array partition (https://leetcode.com/problems/array-partition/)
//TC : O(nlogn)
//SC: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            res=res+nums[i];
        }
        return res;
        
    }
}

//Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
//TC : O(n)
//SC: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
}

// Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)
//TC : O(n)
//SC: O(1)
class Solution {
    public static void swap(int nums[], int i, int j)
    {
int temp=nums[i];
nums[i]=nums[j];
nums[j]=temp;
    }
        public static void reverse(int nums[], int i, int j)
    {
while(i<j)
{
    swap(nums,i,j);
    i++;
    j--;
}
    }
    
    public void nextPermutation(int[] nums) {
        int p=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                p=i-1;
                break;
            }
        }
        if(p==-1)
        {
            reverse(nums,0,n-1);
            return;
        }
        int q=-1;
          for(int i=n-1;i>=p+1;i--)
        {
            if(nums[i]>nums[p])
            {
                q=i;
                break;
            }
        }
        swap(nums,p,q);
        reverse(nums,p+1,n-1);
    }
}
