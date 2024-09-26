//Time : O(n log n)
// Space : O(1)
// Leetcode : Yes
// Approach : 
// 1. The solution would be to group the integers into pairs such that the distance between the integers in the pairs is minimum.
// 2. One way to do it is to sort the array, so that the integers close to each other can be in consecutive order.
// 3. Now , since array is sorted first element in each pair will be minimum element.So add all elements in array with even index and return sum.
class arrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i<nums.length-1;i = i+2){
            sum += nums[i];
        }
        return sum;
    }
}
