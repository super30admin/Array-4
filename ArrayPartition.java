/*
* Approach: 
    - The idea is to minimize the difference so that the we can get the maximum val
    - We can start by sorting the array that way we can make sure the adjacent elements has the least difference so giving us the maximum sum
    - TC: O(nlogn) -> sort the array and then iterate over all the elements to find the sum
    - SC: O(1) -> no additional space used
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int slow = 0;
        int fast = 1;

        while(fast < nums.length){
            sum += Math.min(nums[slow], nums[fast]);
            slow = fast + 1;
            fast = fast + 2;
        }
        return sum;
    }
}


/*
* Approach2: The idea is to reduce the complexity and use bucket sort
- Use map to store the element and the freq and a boolean variable to keep track of the position(even/odd)
- start with flag as true, whenever flag is true add the element to the result, reduce the freq and change the flip the flag to false
- that basically means, choose this element, dont choose this element kind of a scenario
TC: O(n) + O(min to max) -> n is the length of the array and another iteration from min element in nums to max element in nums
SC: O(n) -> to store the elements and its frequencies
*/ 
class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        boolean flag = true;
        int res = 0;

        for (int currKey = min; currKey <= max; currKey++) {
            if (map.containsKey(currKey)) {
                int freq = map.get(currKey);
                while (freq > 0) {
                    if (flag) {
                        res += currKey;
                        flag = false;
                    }
                    else{
                        flag = true;
                    }
                    freq--;
                }
            }

        }
        return res;
    }
}