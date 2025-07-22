// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : From the end, find the first index where current element <next ele (say i_). From the subsequent element, find the next greatest element
/// and replace it with the ith index and reverse all elements in range i+1 to end 
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        //find the breach
        while(i>=0){
            if(nums[i]<nums[i+1]){
                break;
            }
            i--;
        }
        int nextGreatestIdx = -1;
        System.out.println(i);
        if(i>=0){
            int nextGreatest = nums[i];
            //find the next largest element in RHS
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    nextGreatest = nums[j];
                    nextGreatestIdx = j;
                    System.out.println(nextGreatest+" "+nextGreatestIdx);
                }
            }
            System.out.print(nextGreatestIdx);
            if(nextGreatestIdx != -1){
                int temp = nums[i];
                nums[i] = nums[nextGreatestIdx];
                nums[nextGreatestIdx] = temp;
            }
        }
        reverse(nums, i+1, n-1);
    }
    public void reverse(int nums[], int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}