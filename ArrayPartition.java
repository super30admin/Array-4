// TC = O(nlogn) -- as we used sort
// class Solution {
//     public int arrayPairSum(int[] nums) {
//         int maxSum = 0;
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i=i+2){
//             maxSum += nums[i];
//         }
//         return maxSum;
//     }
// }

// Avoid nlogn sorting to make nlogn turn to n -- using bucket/count sort
class Solution {
    public int arrayPairSum(int[] nums) {
        // Create a frequency map i.e map having frequencies/counts of each elements
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = nums[0];
        int max = nums[0];
        int maxSum = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int j = 0;
        for(int i=min;i<=max;i++){
            if(map.containsKey(i)){
                int count = map.get(i);
                while(count>0){
                    if(j%2==0){
                        maxSum +=i;
                    }
                    count--;
                    j++;
                }
            }
        }
        return maxSum;
    }
}