public class NextPermutation {
    //TimeComplexity: O(N)
    //Space Complexity: Constant
    public void nextPermutation(int[] nums) {

        int idx = nums.length - 2;

        while(idx >= 0){
            if(nums[idx]>= nums[idx +1]) idx--;
            else break;
        }

        if(idx >= 0){
            int i;
            for(i = nums.length - 1; i > idx ; i--){
                if(nums[i] > nums[idx])break;
            }
            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
        }
        idx+=1;
        int end = nums.length - 1;
        while(idx < end){
            int temp = nums[idx];
            nums[idx] = nums[end];
            nums[end] = temp;
            idx++;
            end--;
        }


    }
}
