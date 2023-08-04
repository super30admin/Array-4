package problems.arrays;

public class Problem53 {
    public int maxSubArray(int[] nums) {
        int currSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    public int maxSubArray1(int[] nums) {
        int currSum=nums[0];
        int maxSum=nums[0];
        int startIndex=0;
        int endIndex=0;
        int currStart=0;
        for(int i=1;i<nums.length;i++){
            currSum=currSum+nums[i];
            if(currSum<nums[i]){
                currSum=nums[i];
                currStart=i;
            }

            if(maxSum<=currSum){
                maxSum=currSum;
                endIndex=i;
                startIndex=currStart;

            }
        }
        System.out.println("Start Index of maximum Sub Array "+startIndex);
        System.out.println("End Index of maximum Sub Array "+endIndex);
        return maxSum;
    }

        public static void main(String[] args) {

        Problem53 problem =new Problem53();
        System.out.println(problem.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(problem.maxSubArray1(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
