//Time complexity: O(n)
//Space Complexity: O(1)
//Did the code run successfully in LeetCode = yes

package com.madhurima;

public class NextPermutation {
}

class NextPermutationSolution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int n = nums.length;
        int index = -1;

        //step1: locate the index of the element which is smaller than the element to its right
        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        //step2: find and swap the element with the element which is just greater than element found in step1
        if(index != -1){
            for(int i = n-1; i >= 0; i--){
                if(nums[i] > nums[index]){
                    swap(nums, i, index);
                    break;
                }
            }
        }

        //step3: reverse from index+1 to extend
        reverse(nums, index+1, n-1);
    }

    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    private void reverse(int[] nums, int left, int right){
        while(left <= right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
