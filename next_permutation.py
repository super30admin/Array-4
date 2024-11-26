# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
# I find the first decreasing element from right. Then I find the element just bigger than the decreasing element. I then swap this element with decreasing
# element and reverse the array after the decreasing element position.

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int right = nums.size()-2;
        while (right>=0 && nums[right] >= nums[right+1]) {
            right--;
        }
        if (right >= 0) {
            int breach = nums[right];
            int bigger = nums.size()-1;
            while (nums[bigger] <= breach) {
                bigger--;
            }
            swap(nums, bigger, right);
        }
        int start = right + 1;
        int end = nums.size()-1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    void swap(vector<int>& arr, int one, int other) {
        int temp = arr[one];
        arr[one] = arr[other];
        arr[other] = temp;
    }
};
