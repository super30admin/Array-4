
class Solution {
    public int arrayPairSum(int[] nums) {
        // return helper1(nums);
        return helper2(nums);

    }

    /**
     * Time Complexity - O(n logn)
     * Space Complexity - O(1)
     */
    // Method 1
    private int helper1(int[] nums){
        if(nums == null || nums.length==0)
            return 0;

        Arrays.sort(nums);

        int result=0;

        for(int i=0; i<nums.length; i+=2){
            result += nums[i];
        }

        return result;
    }

    /**
     * Time Complexity - O(n)
     * Space Complexity - O(n)
     */
    // Method 2
    private int helper2(int[] nums){
        if(nums == null || nums.length==0)
            return 0;

        int[] count = new int[20001];

        for(int num : nums){
            count[num + 10000]++;
        }
        int result = 0;
        boolean odd = true;

        for(int i=0; i < count.length; i++){
            while(count[i] > 0){
                if(odd){
                    result += (i-10000);
                }
                odd = !odd;
                count[i]--;
            }
        }
        return result;
    }
}