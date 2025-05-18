class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i= nums.length - 2;

        //Find the first decreasing order index;
        while(i>=0 && nums[i] >= nums[i+1]){  //O(n)
            i--;
        }

        //Find the next just biggest element for index i element.
        if(i>0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]){ //O(n)
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);

    }

    private void swap(int[] nums, int i, int j){ //O(1)
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int nums[], int i, int j){  //O(n)
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}


/**
 * Time Complexity: O(n)
 * Space Complexty: O(1)
 */