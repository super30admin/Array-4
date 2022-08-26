//Time Complexity- O(n)
//Space Complexity- O(1)
//Successfully ran on leetcode

class Solution {
 public void nextPermutation(int[] nums) {
     if(nums == null || nums.length ==0) return ; 
     
     int n = nums.length;
     int idx = -1;
     
     //step-1 find the breach i.e an element smaller to the one on its right
     
     for( int i = n-2 ; i >= 0 ; i--){
         if(nums[i] < nums[i+1]){
             idx = i;
             break;
         }
     }
     
     //Step-2 find an element on the right bigger than nums[idx]
     if(idx != -1){
         for( int i = n-1 ; i >=0 ; i--){
         if(nums[i] > nums[idx]){
             swap(nums , i , idx);
             break;
         }
     }
     }
   
     
     //Step 3 reverse the right side from idx+1 to n-1 after swapping 
     reverse(nums, idx + 1, n-1);
 }
 
 private void reverse(int[] nums , int left, int right){
   while(left<= right){  
     swap(nums, left, right);
     left++;
     right--;
   }
 }
 private void swap(int[] nums , int x, int y){
     int temp = 0;
     temp = nums[x];
     nums[x] = nums[y];
     nums[y]= temp;
 }
}