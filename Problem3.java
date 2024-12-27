class Problem3 {
    //find the place where the number is decresing while moving from right to left
    //find the next greater element than the pivot
    //reverse the number starting from pivot
    //TC:O(3N)
    //SC:O(1)
    public void nextPermutation(int[] nums) {

        //pivot is where the value on left is smaller 
        int pivot = nums.length -1;
        //O(N)
        while(pivot>0 && nums[pivot] <= nums[pivot-1]){
            pivot --;
        }

        //found the pivot
        // nums[pivot-1] is with which we swap

        if(pivot != 0){
            int i = nums.length -1;
            while(i>0 && nums[i]<= nums[pivot-1]){
                // 
                i--;

            }
            //swap with the next greater element
            swap(nums,pivot-1,i);

        }
        //reverse everything frm pivot
        int left = pivot;
        int right = nums.length-1;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }


    }

    public void swap(int[] nums,int from,int to){
        int left = nums[from];
        nums[from] = nums[to];
        nums[to] = left;
    }
}