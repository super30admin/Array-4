// TC: O(n)
// SC: O(1)

// Approach: Replace the smallest possible number with the slightly
// bigger number. Then sort the array on the right (reverse elements)

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int breach = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breach = i;
                break;
            }
        }

        if (breach != -1) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[breach] < nums[i]) {
                    int temp = nums[breach];
                    nums[breach] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }

        int i = breach + 1;
        int j = nums.length - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}