// ******************** Without Sorting, used bucket sort ********************

// Time Complexity:  O(n)
// Space Complexity: O(1)
//
// where n is length of given array, m is maximum value in given array

class Solution {
    
    public int arrayPairSum(int[] nums) {

        if(nums == null || nums.length == 0) return 0;
        int result = 0;

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        int K = 10000;
        int[] bucket = new int[2*K+1];
        boolean isSmallFromPair = true;

        for(int num : nums) {
            bucket[num+K]++;
            minVal = Math.min(minVal, num+K);
            maxVal = Math.max(maxVal, num+K);
        }

        for(int i=minVal; i<=maxVal; i++) {
            while(bucket[i]>0) {                             // take values from bucket
                result += isSmallFromPair ? i-K : 0;         // take index from bucket only if flag is true
                bucket[i]--;
                isSmallFromPair = !isSmallFromPair;          // invert flag
            }
        }

        return result;

    }

}



// // ******************** With Sorting ********************

// // Time Complexity:  O(nlogn)
// // Space Complexity: O(1)

// class Solution {
    
//     public int arrayPairSum(int[] nums) {

//         if(nums == null || nums.length == 0) return 0;
//         int result = 0;

//         Arrays.sort(nums);

//         for(int i=0; i<nums.length; i+=2) {
//             result += nums[i];
//         }

//         return result;

//     }

// }
