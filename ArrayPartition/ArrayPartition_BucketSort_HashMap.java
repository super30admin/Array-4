/* Time Complexity : O(n+k)) 
 *  n - len of array - nums */
/* Space Complexity : O(k) 
 * k - size of the hashmap */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

//Bucket sort - HashMap

class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        boolean flag = false;
        for(int i = min; i <= max; i++){
            if(map.containsKey(i)){
                if(flag){
                    //skip one occurence of i
                    //earlier ele was used as min in a pair
                    //reduce the freq of i by 1
                    map.put(i, map.get(i) - 1);
                }
                //curr freq
                int cnt = map.get(i);
                //no of pairs possible 
                int pairs = cnt/2;
                result += pairs * i;
                
                if(cnt%2 != 0){
                    //If cnt is odd it can be a min in a pair and added to the result
                    //set flag to true - notify to skip the next ele
                    result += i;
                    flag = true;
                }else{
                    //cnt even - no more i's left to contribute to the pair
                    //set flag to false - Can include next ele in pair
                    flag = false;
                }
            }
        }
        return result;
    }
}