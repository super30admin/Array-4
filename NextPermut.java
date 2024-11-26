// Time Complexity : O(n) n no.of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
To get the next permutation:
1. Traverse from right to left and Found the breech.(where the current element is lesser than next element)
2. Fixed i at the breeched position and again traverse from the right until i and find the next largest
element to the breeched number.
3.swap both the numbers(breeched and the next largest)
4. reverse the array from i+1 until the end.

class Solution {
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int i=n-2;
        //find the breech
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //swap the next largest of the breeched
        if(i>=0){
            int j=n-1;
            while(j>i && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private void swap(int [] nums,int i,int j){
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
    private void reverse(int [] nums,int s,int e){
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
}