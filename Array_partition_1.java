TC:O(nlogn)
SC:O(1)

Runtime: 16 ms, faster than 10.44% of Java online submissions for Array Partition I.
Memory Usage: 39.2 MB, less than 100.00% of Java online submissions for Array Partition I.

Approach: Sort array and take the sum of alternate entries strarting from 0th index.


class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i+=2){
            sum=sum+nums[i];
        }
        System.out.println(sum);
    return sum;
    }
    
}
