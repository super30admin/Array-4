// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach
// find the breach if(nums[i-1]<nums[i]) breach is at i-1 index
// find the replacing index ( start from end and check nums[j] > nums[breachIndex] then j is replacing index
// replace element
// now sort arry from  breachIndex+1 to length-1 in asc order

class Solution {
    public void nextPermutation(int[] nums) {
        
        // find the breach
        int breachIndex = -1;
        for(int i = nums.length -1 ; i >0; i--)
        {
                  if(nums[i-1]<nums[i])
                     { breachIndex = i-1;
                      break;}
        }
        
        // find the element to with which breached element can be replaced
        int replacingIndex =-1;
        for(int j = nums.length-1; j > breachIndex && breachIndex >= 0 ; j-- )
        {
            if(nums[j] > nums[breachIndex])
            {
                replacingIndex = j;
                break;
            }
        }
        // replace element  
        if(breachIndex != -1 && replacingIndex != -1)
        {  
            swap(nums,breachIndex,replacingIndex);
           
        }
      //sort breachIndex+1 to length element in asc order
        if(breachIndex >= 0)
        reverseArray(nums,breachIndex+1,nums.length-1);
        else  if(breachIndex == -1)
            reverseArray(nums,0,nums.length-1);
        
    }
    
    private void reverseArray(int[] nums, int i , int j)
    {
        while(i<j)
        {
            swap( nums, i ,  j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i , int j)
    {
         int temp =  nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}