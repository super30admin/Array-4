public class ArrayPartition {
    //Time complexity: O(N+K) N= nums length, K = 10000
    //Space complexity = O(K)
    public int arrayPairSum(int[] nums) {
        //form factor
        int k = 10000;

        int[] count = new int[2 * k + 1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i] + k]++;
        }
        int maxSum = 0;
        boolean isEven = true;
        for (int i = 0; i <= (2 * k); i++) {
            while (count[i] > 0) {
                maxSum += isEven ? i - k : 0;

                isEven = !isEven;
                count[i]--;
            }
        }

        return maxSum;

    }
}
