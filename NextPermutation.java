/*
Brute force : Each number with every other number  all possible permutations is O(n!)

//From end keep iterating to see if all are in increasing order say 321. then no breach then only reverse is the next permutation

1. From end keep searching for breach point where no increasing order then from that point 
2. keep searching by comparing the breach element with the next higher.
3. Once found reverse the number from that point. Hence next permutation will be found 

*/

class Solution {
    public void nextPermutation(int[] nums) {
      //edge
      if(nums == null || nums.length ==0) return ;
        
       int i = nums.length - 2; //start from last but one 
      while(i>=0 && nums[i] >= nums[i+1]){
          i--;
      }
    
    //
    if(i >= 0){
        int j = nums.length-1;
        while( nums[j]<= nums[i] ){
            j--;
        }
        swap(nums,i,j); // arrray and indexes to whose values are to be swapped
    }
    
    //in the end reverse entire 
    reverse(nums, i+1, nums.length-1); // from position where next permutation no is placed till the end
    }
   
    private void swap(int[] nums ,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[]nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++; end--;
    }}
}

/*
Time complexity O(n)
Space complexity O(1)
*/
