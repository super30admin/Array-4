/**
 * Time Complexity:  O(n) + O(max - min) where n is length of nums and max and min are the maximum and minimum numbers in the array.
 * Space Complexity: O(n)
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        //Implement using counting sort
        int result = 0;
        //Find the max and minimum in the array
        // Record the frequency of each element in a map
        Map<Integer, Integer> frequencyOfNum = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            frequencyOfNum.put(num, frequencyOfNum.getOrDefault(num, 0) + 1);
        }
        boolean skip = false;
        // Iterate through the map beginnning from min to the max element
        for (int i = min; i <= max; i++) {
            if (!frequencyOfNum.containsKey(i)){
                continue;
            }

            //If the flag is true
            //Decrease the frequeny by 1
            if (skip) {
                frequencyOfNum.put(i, frequencyOfNum.get(i) - 1);
            }
            int freq = frequencyOfNum.get(i);
            // If the frequency of the element is even
            // Divide the freq by 2 and multiply by the element to get the sum
            if (freq % 2 == 0) {
                result += i * freq / 2;
                skip = false;
            } else {// If the frequency of the element is odd
                // Add one element to the result
                //Divide the freq by 2 and multiply by the element to get the sum
                // set the flag as true, to skip the first element in the next key
                result += i;
                result += i * (freq - 1) / 2;
                skip = true;
            }
        }
        return result;

    }
}