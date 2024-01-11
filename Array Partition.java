//  Time Complexity: O(n log n)
//  Space Complexity: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i=0; i<nums.length; i = i+2) result += nums[i];
        return result;
    }
}



//  Time Complexity: O(n + max_element)
//  Space Complexity: O(n)
class Solution {
    public int arrayPairSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int ele: nums){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        boolean flag = false;
        while(min<=max){
            if(map.containsKey(min)){

                if(flag){
                    map.put(min, map.get(min)-1);
                }
                int count = map.get(min);
                result += count/2 * min;
                if(count%2 != 0){
                    result += min;
                    flag = true;
                }else{
                    flag = false;
                }
            }   
            min++;
        }
        return result;
    }
}