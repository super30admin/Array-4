// This solution uses a bucket sort algorithm where we first get the min and max possible in the array
// We then build count array within the range
// We iterate from min to max and get the count of each number
// If it is even we take the half count of it and if its odd we take half+1 and flag an odd boolean. If at all flag is true, we decrement the val in upcoming numbers
class Solution {
    public int arrayPairSum(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i:nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int[] arr = new int[max-min+1];
        for(int i=0;i<nums.length;i++) {
            arr[nums[i]-min]++;
        }

        boolean flag = false;
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) continue;
            int element = i+min;
            int val = arr[i];

            if(flag) {
                flag=false;
                val--;
            }

            if(val%2==0) {
                sum+=((val/2)*element);
            } else {
                sum+=((val/2)*element);
                sum+=element;
                flag=true;
            }
        }
        return sum;
    } 
}
