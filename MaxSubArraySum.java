
public class MaxSubArraySum {
	// Time O(n)
	// Space O(1)
	public int maxSubArray(int[] nums) {
        int maxHere=0;
        int maxSoFar=Integer.MIN_VALUE;
        int i=0;
        while(i<nums.length){
             maxHere=maxHere+nums[i];
            if(maxHere<nums[i])
                maxHere=nums[i];
            if(maxSoFar<maxHere)
                 maxSoFar=maxHere;

            i++;     
        }

        return maxSoFar;
    }
}
