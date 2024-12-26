//561. Array Partition - https://leetcode.com/problems/array-partition/description/

//Brute Force:
//Time Complexity: O(n!)
//Find all possible combinations of the given nums[], take minimum of the pair and compare to the maximum sum.


//using Array Sort
//Time Complexity: O(n*log(n) + n)
class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int result = 0;
        Arrays.sort(nums);
        for(int i=0; i<n; i=i+2){ //make pairs
            result = result + nums[i];
        }
        return result;
    }
}


//Bucket Sort - only if range is optimal
//Optimal:
//Time Complexity: O(n) + O(range) ~ O(n)
class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //to make the frequency map with frequencies
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        //to keep track of even/odd freq and to handle in odd case
        boolean flag = false;
        //go through the map
        for(int i=min; i<=max; i++){
            if(!map.containsKey(i)) continue;
            if(flag){
                //for odd freq, 1 frq remains
                map.put(i, map.get(i)-1);
                flag = false;
            }
            int frq = map.get(i);
            if(frq % 2 == 0){ //even case
                result += frq/2 * i;
            } else{ //odd case
                result += frq/2 * i;
                result += i;
                flag = true;
            }
        }
        return result;
    }
}
