//Time: O(n)
//Space: O(1)


class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;

        for(int i:nums){
            if(i>current && current<0)
                current = i;

            else
                current += i;

            max = Math.max(max, current);
        }

        return max;
    }
}