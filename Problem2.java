//maximum subarray
//tc - O(n)
//sc - O(1)

public class Problem2 {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Problem2 p = new Problem2();
        System.out.println(p.maxSubArray(nums));


    }
    public int maxSubArray(int[] nums) {
        int max = 0;
        int curr_sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            curr_sum = Math.max(nums[i], curr_sum+ nums[i]);
            max = Math.max(max, curr_sum);
        }
        return max;
    }

    
}
