class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int n = nums.length;
        int i = n-2;
        //1. Find the element which is smaller than the elemen on the right
        while(i >=0 && nums[i] >= nums[i+1]){
            i--;
        }

        //2. Find the element which is just greater than the element discovered at index i in the step1
        int j = n-1;
        if(i >= 0){
            while(j >= 0 && nums[j]<= nums[i]){
                j--;
            }
            swap(nums, i,j);
        }

        //3. Reverse the part after i + 1
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums,int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private void reverse(int[] nums, int l, int r){
        while(l <= r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }


    public static void main(String[] args){
        NextPermutation obj = new NextPermutation();
        int[] nums= {1,2,3};
        obj.nextPermutation(nums);
    }
}