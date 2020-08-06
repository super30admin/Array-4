//Time Complexity :O(n)
//Space Complexity :O(1)
//Did it run on leetcode : yes

class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return;
        if(nums.length == 1)
            return;
     int i = nums.length-2;
     ///step 1
    //finding where the increasing sequence is breaking from the end;
    while(i >= 0){
        if(nums[i] < nums[i+1])
           break;
        i--;
    }
      
    //if it is highest possible number then just reverse to get the lowest possible number
        //321->123
    if(i == -1)
    {
      reverse(nums,0,nums.length-1);
     return;
    }   
        //step2 
      //swap with the next highest number  
     int j = nums.length-1;
     while( j > i){
         if(nums[j] > nums[i]){
             swap(nums,j,i);
             break;
         }
         j--;
     }
        
        //step3
        //after swaping reverse the remainig part just to get the smallest number.
        reverse(nums,i+1,nums.length-1);
        
    }
    
    private void swap(int[] nums , int start, int end){
        
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    
    private void reverse(int[] nums, int start , int end){
        
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
    }
}