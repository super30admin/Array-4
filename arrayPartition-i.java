//APPROACH: Sort the array and sum while incrementing the index by 2 each time because when the array is sorted the higher index of every pair is going to give the better value for larger sum.

//time complexity O(n)
//space complexity O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length ==0 ) return 0;
        Arrays.sort(nums); int sum = 0;
        for(int i = 0; i < nums.length; i=i+2){
            sum += nums[i];
        }
        return sum;
    }
}
