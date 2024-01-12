// Time Complexity : O(n log(n))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Sorting
 */
class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums); //O(n log(n))
        int n = nums.length;
        int result = 0;

        //O(n)
        for(int i=0; i<n; i=i+2) {
            if(i == n-1)
                result += nums[i];
            else
                result += Math.min(nums[i], nums[i+1]);
        }

        return result;
    }
}

/**
 * HashMap solution, Modified version of bucket sort to save space.
 */
// Time Complexity : O(max(nums) - min(nums))
// Space Complexity : O(n)
class Solution {
    public int arrayPairSum(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int n: nums) { //O(n)
            map.put(n, map.getOrDefault(n, 0) + 1);
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        boolean flag = false;

        for(int i=min; i<=max; i++) {
            if(map.containsKey(i)) {
                if(flag)
                    map.put(i, map.get(i)-1);

                int count = map.get(i);

                result += count/2*i;
                if(count%2 == 0) {
                    flag = false;
                }
                else {
                    flag = true;
                    result += i;
                }
            }
        }

        return result;
    }
}

/**
 * Bucket sort solution
 */
// Time Complexity : O(max(nums) - min(nums)) (Worst case: O(2*k))
// Space Complexity : O(2*k)
class Solution {

    final static int k = 10000;

    public int arrayPairSum(int[] nums) {

        int[] arr = new int[2*k+1];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int result = 0;

        for(int n: nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
            arr[k+n]++;
        }

        boolean flag = false;
        for(int i=min; i<=max; i++) {
            if(arr[k+i] > 0) {
                if(flag) arr[k+i]--;
                int cnt = arr[k+i];
                result += cnt/2*(i);
                if(cnt%2 == 0) {
                    flag = false;
                }
                else {
                    flag = true;
                    result += (i);
                }
            }
        }

        return result;
    }
}