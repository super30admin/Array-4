// Appproach : From brute force where we form all permutations (with exponential time) and take the min of each pair and calculate the sum.
// In BruteForce we can see for many certain pairs minimum is always same {(1,2),(1,3),(1,4),..(1,8),(1,9)). So we are wasting the compute .
// So if you sort the array then you will have the pair with num just greater. 
// Time : O(nlogn)
// Space : O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length ==0) return 0;
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0;i<nums.length;i+=2){
            sum +=nums[i];
        }
        return sum;
    }
}

// Approach : Bucket Sort - create a freq map with min and max. Iterate through the map with min and max so you have the keys in an order (sorted basically)
// Time :  O(n) -> to create the map + O(range) -> to iterate over the map
// Space : O(range) // if range is 10^4(I/P) then bucket sort will be slow
class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // create a map with a range -min & max - bucket sort
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        System.out.println(map);

        boolean flag = false;
        for (int i = min; i <= max; i++) {
            if (!map.containsKey(i))
                continue;
            if (flag) {
                map.put(i, map.get(i) - 1);
                flag = false;
            }
            int freq = map.get(i);
            // even count frequency
            if (freq % 2 == 0) {
                result += freq / 2 * i;
            } else {
                // odd count frequency
                result += freq / 2 * i; // even
                result += i;
                flag = true;
            }
        }
        return result;
    }
}