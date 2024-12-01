//intution is to pair min num together after i sort, so that if i do not waste max num if paired with min num
//tc- nlogn + n

// class Solution {
//     public int arrayPairSum(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         int result = 0;

//         for(int i = 0; i < n; i += 2){//checking in pairs
//             result += nums[i];
//         }
//         return result;
//     }
// }

//bucket, tc- O(n) sc- O(range)

class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1 );
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        boolean flag = false;
        for(int i = min; i <= max; i++){
            if(map.containsKey(i)){
                if(flag){
                    map.put(i, map.get(i) - 1);//in case of odd pairs to pair extra ele to next ele, minus 1 from next ele
                    flag = false;
                }
                int freq = map.get(i);
                if(freq % 2 == 0){
                    result += (freq/2) * i;
                    flag = false;
                }else{
                    result += (freq-1)/2 * i;
                    result += i;
                    flag = true;
                }
            }
        }
        return result;
    }
}