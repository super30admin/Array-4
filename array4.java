//problem1
class Solution {
    public int arrayPairSum(int[] nums) {
        // Store frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();
        // Find minimum and maximum values in the array
        int mini = Integer.MAX_VALUE;
        int maxi = 0;
        // Stores the final answer
        int res = 0;
        // Build frequency map and find min & max
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }
        // Flag indicates whether the current number
        // should be skipped because it was already paired
        // with the previous number
        boolean flag = false;
        // Traverse all numbers from minimum to maximum
        for (int i = mini; i <= maxi; i++) {
            // Skip numbers that are not present
            if (!map.containsKey(i))
                continue;
            // If previous number had an odd frequency,
            // one occurrence of current number is already paired
            if (flag) {
                map.put(i, map.get(i) - 1);
            }
            // Remaining frequency of current number
            int f = map.get(i);
            if (f % 2 == 0) {
                // Every pair contributes one minimum value (i)
                res += (f / 2) * i;
                // No leftover element
                flag = false;
            } else {
                // Even pairs contribute their minimum
                res += (f / 2) * i;
                // One element remains unpaired,
                // which will become the minimum of the next pair
                res += i;
                // Next number must skip one occurrence
                flag = true;
            }
        }
        return res;
    }
}
//problem 2
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int curr=nums[0];
        int res=nums[0];
        for(int i=1;i<n;i++){
            curr=Math.max(curr+nums[i],nums[i]);
            res=Math.max(res,curr);
        }
        return res;
    }
}
//problem3
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
            if(i>=0){
                int j=n-1;
                while(nums[j]<=nums[i]) j--;
                swap(nums,i,j);
            }
             reverse(nums,i+1,n-1);
        }
        public void reverse(int[] nums,int le,int re){
            while(le<re){
                swap(nums,le,re);
                re--;
                le++;
            }
        }
        public void swap(int[] nums,int lp,int qp){
            int temp=nums[lp];
            nums[lp]=nums[qp];
            nums[qp]=temp;
        }
    }
