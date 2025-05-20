// Time Complexity: O(n+k) where n is the number of elements in the array and k is the range of the numbers
// Space Complexity: O(k) where k is the range of the numbers
// Problem: https://leetcode.com/problems/array-partition/

/**
	•	Given an array of 2n integers, pairs them to maximize the sum of the minimum in each pair.
	•	Uses a frequency map and simulates sorting by iterating from min to max element.
	•	Time-efficient approach avoiding full sort by using a greedy frequency sweep.
*/

class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        int result = 0; 
        Map<Integer, Integer> hmap = new HashMap<>(); 

        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 
        boolean flag = false; //for odd freq

        for(int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            hmap.put(i, hmap.getOrDefault(i,0)+1);
        }

        for(int i = min ; i <= max ; i++) {
            if(!hmap.containsKey(i)) continue;

            int freq = hmap.get(i);
            if (flag) { 
                freq--;
            }
            if(freq % 2 == 0) {
                result += i *  (freq / 2);
                flag = false;
            } else {
                result += i *  (freq / 2);
                result += i; 
                flag = true;
            }

        }
        return result;
    }
}
