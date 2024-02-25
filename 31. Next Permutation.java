class Solution {

    private void invert(int a, int b, int[] nums){
        while(a < b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }

    public void nextPermutation(int[] nums) {

        int prev = nums[nums.length-1];

        for(int i = nums.length-2; i > -1; i--){
            if(nums[i] < prev){
                // magic happens
                //invert the remaining digits
                invert(i+1, nums.length-1, nums);
                // binary search inverted digits to find smallest number greater than nums[i];
                int low = i+1;
                int high = nums.length-1;
                while(low <= high){
                    int mid = low + (high-low)/2;
                    int numMid = nums[mid];
                    if(numMid <= nums[i]){
                        low = mid+1;
                    } else {
                        // found the saddle point
                        if(nums[mid-1] <= nums[i]){
                            // swap nums[i] with nums[mid]
                            int temp = nums[i];
                            nums[i] = nums[mid];
                            nums[mid] = temp;
                            return;
                        } else high = mid-1;
                    }
                }
            } else prev = nums[i];
        }

        // could not increment. need to "overflow"
        invert(0, nums.length-1, nums);
        
    }
}
