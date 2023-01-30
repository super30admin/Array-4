/*
To get the maximum sum, we need to pair the max elements with the other max elements
if we can sort the array and then start making pairs, we would get the max output
Time : O(n*logn + n)
*/

class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums); // O(n log n)

        int i=0;
        int max = 0;
        while(i<nums.length){ // O(n)
            max+= Math.min(nums[i], nums[i+1]);
            i = i+2;
        }

        return max;
        
    }
}