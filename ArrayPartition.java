class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int min = 100000; 
        int max = -100000;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(num < min) min = num;
            if(num > max) max = num;
        }
        boolean flag = true;
        int i = min;
        while(i <= max){
            if(!map.containsKey(i) || map.get(i) == 0){ // if i is not in the map or already consumed
                i++;
                continue;
            }
            // flag is true, I can take a number
            if(flag){
                result+= i;
                map.put(i, map.get(i) - 1);
                flag = false;
            }else{
                map.put(i, map.get(i) - 1);
                flag = true;
            }
        }
        return result;
    }
}
