import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        // return heleprSort(nums);
        return helper(nums);
    }

    //Tc: O(nlogn)
    //Sc: O(1)
    private  int heleprSort(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            max = max + Math.min(nums[i], nums[i + 1]);
        }
        return max;
    }

    public int helper(int[] nums) {
        int[] count = new int[20001];
        for (int num: nums) {
            count[num+10000]++;
        }
        int sum=0;
        boolean add = true;
        for (int i =0; i < count.length; i++) {
            while (count[i] > 0) {
                if (add) {
                    sum+=i-10000;
                }
                add = !add;
                count[i]--;
            }
        }
        return sum;
    }
}