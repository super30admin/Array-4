/*
Time complexity: O(N), N is the length of given array
Space Complexity: O(1), constant space
Run on leetcode: yes
Any difficulties: No

Approach:
1. I will be using Kadane's Algorithm to solve this problem, using currMax and subArrayMax
2. When I encounter negative element I have to add that in the currSum, but if that decreases my subArryMax sum I am not
gonna consider that value and will not update my subArrayMax sum
 */
public class MaximumSubarray {
    public static int maximumSubarray(int[] nums){
        int currMax = nums[0];
        int subarrayMax = nums[0];

        for(int i = 1; i<nums.length; i++){
            int num = nums[i];
            currMax = Math.max(num, currMax+num);
            subarrayMax = Math.max(subarrayMax, currMax);

        }
        return subarrayMax;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Maximum sub array sum: "+ maximumSubarray(nums));
    }
}
