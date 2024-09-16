import java.util.Arrays;
/*
Time Complexity: O(N), where N is the length of the nums array
Space Complexity: O(1), constant space
Run on leetcode: yes
Any difficulties: no

Approach:
1. The pattern to find next permutation is to stick to the first element and if the next two elements are arranged
in the ascending order, we can swap the remaining two numbers to get next permutation
2. This problem would be combination of swap and reverse of the array elements
3. If the given array is completely in the descending order we can return the first permutation by reversing the entire
given array
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums){

        // setting a pivot at nums.length-2
        int k = nums.length-2;

        // Will decrease my k till I get the elements in ascending order
        while(k>=0 && nums[k]>= nums[k+1]){
            k--;
        }

        // If k is -1 that is the given array is all permutated, I am gonna reverse the array
        if(k == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }

        // Swapping values to get the next greater permutation
        for(int i = nums.length-1; i>k; i--){
            if(nums[i]>nums[k]){
                swap(nums, i, k);
                break;
            }
        }
        reverse(nums, k+1, nums.length-1);
    }

    // Helper Method to reverse the array
    public static void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    // Helper method to swap the elements
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        int[] nums1 = {1,1,5};
        int[] nums2 = {3,2,1};
        nextPermutation(nums);
        nextPermutation(nums1);
        nextPermutation(nums2);
        System.out.println("Next Permutation: "+ Arrays.toString(nums));
        System.out.println("Next Permutation: "+ Arrays.toString(nums1));
        System.out.println("Next Permutation: "+ Arrays.toString(nums2));
    }
}
