/**
Initialize maxSum and currSum to the first element of nums. Initialize currSt, st, and end to 0.
Iterate through nums, updating currSum by adding the current element. If currSum becomes less than the current element, update currSt to the current index and reset currSum.
Update maxSum if currSum exceeds it, and update st and end accordingly.
Time Complexity: O(n), where n is the length of the input array nums.
Space Complexity: O(1), as the algorithm uses only a constant amount of extra space regardless of the size of the input array.
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currSum=nums[0];
        int currSt=0, st=0, end=0;
        for(int i=1;i<nums.length;i++){
            currSum += nums[i];
            if(currSum < nums[i]){
                currSt = i;
                end = i;
                currSum = nums[i];

            }
            if(currSum>maxSum){
                maxSum = currSum;
                end = i;
                st = currSt;
            }
            
        }
        System.out.println(st);
        System.out.println(end);
        return maxSum;
        
    }
}
