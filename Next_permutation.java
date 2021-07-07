TC: O(n)
SC: O(1)

Runtime: 1 ms, faster than 88.65% of Java online submissions for Next Permutation.
Memory Usage: 39.5 MB, less than 50.00% of Java online submissions for Next Permutation.

Approach: Traverse from right to find an index that is smaller than number in its next index.Let this be the first element.Again traverse
from right and find the number that is greater than the first element.Let this be the second element. Swap the first and second element.
Then reverse the number starting from index next to the first element index.


class Solution {
    public void nextPermutation(int[] nums) {
        
        int first=0; int next_high=0;
        for(int i=nums.length-2; i>=0;i--){
            if(nums[i]<nums[i+1]) {
                first = i;
                break;
            }
        if(i==0){  
        Arrays.sort(nums);
        return;
                }
        }
        for(int i=nums.length-1;i>0 ;i--){
            if(nums[i]> nums[first]) {
                next_high = i;
                break;
            }
        }
        swap(first,next_high, nums);
        reverse(nums,first,nums.length);
        
        return;
    }
    private void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    private void reverse(int[] arr, int first,int length){
        int l=first+1;
        int r=length-1;
        while(l<=r){
            swap(l,r,arr);
            l++;
            r--;
        }
    }
    
}
