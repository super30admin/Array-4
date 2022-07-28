// TIme Complexity: O(NlogN)
// Space Complexity: O(1)
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i =0; i< nums.length; i= i+2){
            int min = Math.min(nums[i], nums[i+1]);
            res += min;
        }
        return res;
    }
}
