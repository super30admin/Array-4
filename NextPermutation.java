// Time Complexity: O(n)
// Space Complexity: O(1)
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
           
           int n = nums.length;
           int misplaced = -1;
           // search for index where i < i+1
           for(int i = n-2 ; i >= 0 ; i--)
           {
               if(nums[i] < nums[i+1])
               {
                   misplaced = i;
                   break;
               }
           }
           // if we found misplaced element
           if(misplaced != -1)
           {
               // find element greater than current misplaced element
               for(int i = n-1; i >= 0 ; i--)
               {
                   if(nums[i] > nums[misplaced])
                   {
                       // swap
                       swap(nums, i, misplaced);
                       break;
                   }
               }
           }
           
           // reverse all number after the misplaced number
           reverse(nums, misplaced+1 , n-1);
       }
       
       
       private void swap(int nums[], int l, int r)
       {
           int temp = nums[l];
           nums[l] = nums[r];
           nums[r] = temp;
       }
       
       private void reverse(int nums[], int l , int r)
       {
           while(l < r)
           {
               swap(nums, l, r);
               l++;
               r--;
           }
       }
}
