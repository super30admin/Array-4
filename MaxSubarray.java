//T.C O(n)
//S.C O(1)

//In linear pass, calc running sum and maintain max variable when the sum is max.
//If Array index is asked, maintain start and end index, Update end with every new max and update start index whenever
// currSum is greater than max
class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        int max = nums[0];
        //to record the max array indexes
        int start = 0, end = 0, currSt = 0;
        for(int i=1;i<n;i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            if(currSum<nums[i]){
                currSum = nums[i];
                currSt  = i;
            }
            if(max < currSum ){
                max = currSum;
                start = currSt;
                end = i;
            }
            max = Math.max(max, currSum);
        }
        System.out.println(start + " " + end);
        return max;
    }
}