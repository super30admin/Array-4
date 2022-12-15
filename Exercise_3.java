class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
         int i = n-2;

         while(i>=0){
             if(nums[i]<nums[i+1]){
                 break;
             }
             --i;
         }
         
         if(i !=-1){
             int j =n-1;
             while(j > i){
                 if(nums[j] > nums[i]){
                     break;
                 }
                 --j;
             }
             swap(nums, i, j);
         }

         reverse(nums, i+1, n-1);
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        }
    private void reverse(int[] arr, int s, int e){
        System.out.println(e);
        while(s < e){
            swap(arr, s, e);
            ++s;
            --e;
        }
    }
}

//tc =O(n)
//sc =O(1)
