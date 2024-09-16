/*

Did it run leetcode: yes
Did you face any problem: After swapping how to chnage order

Time Complexity: 0(N)
Space Compelxity: 0(1)

Algorithm:
- starting from right we find two consecutive numbers a[i]>a[i-1], from the right. 
- Thus, all numbers to the right of a[i−1] are already sorted in when we already scanned them.
- we simply need to reverse the numbers following a[i−1] to get the next smallest permutation.

*/



class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int i = n-2;
        
        while(i>=0 && nums[i]>=nums[i+1]){
            i-=1;
        }
        
        if(i>=0){
            int j=n-1;
            while(j>=0 && nums[i]>=nums[j]){
                j-=1;
            }
            int swap = nums[j];
            nums[j] = nums[i];
            nums[i] = swap;
        }
        
        
        int start = i+1,end=n-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
        //return nums;
        
    }
}