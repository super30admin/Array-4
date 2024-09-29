class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int action = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                action = i;
                break;
            }
        }
        
        if (action != -1) {
            int nextInd = -1;
            for (int j = n - 1; j > action; j--) {
                if (nums[j] > nums[action]) {
                    nextInd = j;
                    break;
                }
            }
            
            swap(nums, action, nextInd);
        }

        reverse(nums, action + 1, n - 1);
    }

    public void swap(int[] nums, int action, int nextInd) {
        int temp = nums[action];
        nums[action] = nums[nextInd];
        nums[nextInd] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
