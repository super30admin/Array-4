//TC: O(n+n+n)
//SC: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==0)
            return;
        int peekIndex = -1;
        int peekIndexOut = -1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
            {
                peekIndex = i;          //Traversing from behind and finding a dip of value and getting the index of it.
                break;                  
            }               //If no dip just reversing all the elements will give next permutations
        }
        for(int i =nums.length-1;i>=0 && peekIndex!=-1;i--)
        {
            if(nums[peekIndex]<nums[i]) //traversing from back and swapping the peekindex element with the first smaller element than it found in the array.
            {
                peekIndexOut = i;       //After that reversing rest of the elements
                
                nums[peekIndex] = nums[peekIndexOut]+nums[peekIndex];
                nums[peekIndexOut] = nums[peekIndex]-nums[peekIndexOut];
                nums[peekIndex] = nums[peekIndex]-nums[peekIndexOut];               
                break;
            }
        }        
        reverse(nums,peekIndex+1);
    }
    void reverse(int[] nums,int peekIndex)
    {
        int l = peekIndex;
        int r = nums.length-1;
        while(l<r)
        {
            nums[l] = nums[l]+nums[r];
            nums[r] = nums[l]-nums[r];
            nums[l] = nums[l]-nums[r];
            l++;
            r--;
        }
    }
}