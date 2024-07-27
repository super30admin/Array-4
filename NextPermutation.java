class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int index1 = -1, index2 = -1;

        //Step 1 : Find a digit which is smaller than its right neighbor
        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                index1 = i;
                break;
            }
        }

        //Step 2 : Find a digit int the right of index1 which is just greater than the digit at index1 ie find the first
        //greater as we know the sequence from n-1 to index1 is increasing numbers because till index1 we did not find
        //an element which is smaller than its right neighbor
        if(index1 >= 0) {
            for(int i=n-1; i>index1; i--) {
                if(nums[i] > nums[index1]) {
                    index2 = i;
                    break;
                }
            }
            if(index2 == -1) {
                return;
            }
        }

        //Step 3 : Swap index1 and index2
        if(index1 >= 0) {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
        }

        //Step 4 : Reverse all elements after index1
        int start = index1+1;
        int end = n-1;
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
