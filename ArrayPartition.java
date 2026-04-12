// Time Complexity : O(n) + O(min, max)
// Space Complexity : O(n) for hash map
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
We use a hash map to record the numbers along with their frequencies and also keep track of minimum, maximum
values. We iterate from this minimum value to maximum  to first check if map contains that value. If not, just
continue. If so, we get the frequency of that value to understand its occurence in even or odd times. If even
times, we directly know that we can only make use of that number even number of times in each formed pair. If
frequency is odd, we can definitely use even times of that digit, but also an extra time for a new pair given
its minimum value. So, for us to be able to differentiate the frequency better and make it even, we use a boolean
flag to keep track of odd occurence and when its true, we subtract that frequency.
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        boolean flag = false;
        for(int i = min ; i <= max ; i++) {
            if(!map.containsKey(i))
                continue;
            if(flag)
                map.put(i, map.get(i) - 1);
            int frq = map.get(i);
            if(frq % 2 == 0) {
                result += (frq / 2) * i;
                flag = false;
            }
            else {
                result += (frq / 2) * i;
                result += i;
                flag = true;
            }
        }
        return result;
    }
}