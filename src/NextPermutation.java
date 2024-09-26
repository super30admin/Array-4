// TC: O(n)
// SC: O(1)
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        // Find the breaching number
        while(i>= 0 && nums[i] >= nums[i+1]) { //O(n)
            i--;
        }
        
        // Find the next just larger element to the breaching number to its right
        int j = n-1;
        if(i!= -1) {
            while(nums[j] <= nums[i]) { //O(n)
                j--;
            }
            swap(nums,i,j); //O(1)
        }
        reverse(nums,i+1,n-1); // O(n)
    }

    private void reverse(int [] nums, int a, int b) {
        while(a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }

    private void swap(int[] nums, int a , int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


}