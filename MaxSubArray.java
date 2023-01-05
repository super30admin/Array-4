//Time complexity is O(N+K) N is length of nums,K is 10000
//Space complexity is O(K)
class Solution {
    final static int K = 10000;
    
    public int arrayPairSum(int[] nums) {
        int[] elementToCount = new int[2 * K + 1];
        for (int element : nums) {
            elementToCount[element + K]++;
        }
        int maxSum = 0;
        boolean isEvenIndex = true;
        for (int element = 0; element <= 2 * K; element++) {
            while (elementToCount[element] > 0) {
                maxSum += (isEvenIndex ? element - K : 0);
                isEvenIndex = !isEvenIndex;
                elementToCount[element]--;
            }
        }
        return maxSum;
    }
}