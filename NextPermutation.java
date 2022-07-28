// If we have the absolute greatest permutation possible from the given numbers, then the digits would be in the decreasing order. For example, in case of [1,2,3] ,the absolute biggest possible number is [3,2,1]. If we have this number, then the next iteration would be to return back to the minimum iteration ie [1,2,3]. to check this, first you start from the second last element of the array and compare with the last element , then the third last element with the second last element and so on. At any point if you find that the greater index element has a greater value than the smaller index element, that means you are at the point where you need to make a switch, so you break. In case you dont find such a point (meaning i became -1) , it means that you are already at the absolute maxmium element so just reverse the input array and return. If thats not the case, then you know which index element needs to be switched (the one at index i). Now again iterate from the end of the array till you find a number thats greater than nums[i]. The first such element is the one that nums[i]will be replaced with. So swap these 2 elements. Now reverse the subarray from the i+1th position till the end of the array. This gives you the next permutation.

// Time O(n)
// Space O(1)

class Solution {
    public void nextPermutation(int[] nums) {
       int n  = nums.length;
        int i;
        for(  i =n-2; i>=0;i--)
        {
            if(nums[i+1]>nums[i])
                break;      
        }
         if(i<0)
         {
             reverse(nums,0,n-1);
             return;
         }
        
        int j;
        for( j=n-1; j>=0;j--)
        {
            if(nums[j]>nums[i])
                break;
        }
 
        int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
        n--; i++;
         reverse(nums,i, n);
     
        }
    
    private void reverse(int [] nums, int start, int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
            start++; 
            end--;
        }
    }

}
