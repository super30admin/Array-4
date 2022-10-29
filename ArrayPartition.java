// Time Complexity : O(n log n)
// Space Complexity : O(n)
//  n is the number of elements in given array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public int arrayPartition(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Solution s = new Solution();
        int[] val = new int[]{8, 10, 9, 11, 9, 9, 12, 2, 7, 12};
        System.out.println(s.arrayPartition(val));
    }
}