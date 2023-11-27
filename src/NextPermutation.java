// Time Complexity:  O(n)
// Space Complexity: O(1)

class Solution {
    
    public void nextPermutation(int[] nums) {                      // [1,6,8,7,3,5,4,2]
        
        int n = nums.length;
        int i = n-2;
        int j = n-1;

        while(i>=0 && nums[i]>=nums[i+1]) {                        // i stops at 3
            i--;
        }

        if(i>=0) {                                                 // if [3,2,1] this step not needed
            while(nums[i]>=nums[j]) {                              // find smallest great value of 3, here it is 4
                j--;
            }
            nums[i] = (nums[i]+nums[j]) - (nums[j]=nums[i]);       // swap 4 with 3, [1,6,8,7,4,5,3,2]
        }

        reverse(nums, i+1, n-1);                                   // reverse (5,3,2), [1,6,8,7,4,2,3,5]

    }

    private void reverse(int[] nums, int i, int j) {
        while(i<j) {
            nums[i] = (nums[i]+nums[j]) - (nums[j]=nums[i]);
            i++;
            j--;
        }
    }

}
