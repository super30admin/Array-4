// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/*
We use bucket sort approach to pair the elements and fetching the max sum without sorting them
We use a hashmap to maintain the freq of each number in the array
And a flag to decide if to be added to the res or not
If frequency is even we add a pair to the result and make flag as false to comsider next element
if frequency is odd along with pair we add the element and skip th next element
Bucket sort is recommended only for small range of numbers
*/

class Solution {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        //find the min and max number in nums[]
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) +1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        //false = take the element, true - skip the element
        boolean flag = false;
        for(int i = min; i <= max; i++){
            if(!map.containsKey(i)) continue;
            if(flag) {
                //skip it ie reduce its count in map
                map.put(i, map.get(i) - 1);
                flag = false;
            }
            //get the freq of cur element
            int freq = map.get(i);
            //check if freq is even 
            if(freq%2 == 0) {
                res += (freq/2) * i;
                flag = false;
            } else {
                //odd number of elements
                res += (freq/2) * i;
                res += i;
                flag = true;
            }

        }
        return res;
        
    }
}
