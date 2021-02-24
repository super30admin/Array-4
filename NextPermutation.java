//Problem 124: Next Permutation
//TC:O(n)
//SC:O(1)

/*Steps:
    Bruteforce:O(n!): Find all permutations and then check the bigger one

    Optimized: O(n)
               1) Find the Breach i.e the element smaller than the next element
               2) If Breach happened, find the next greatest element from backwards and swap it with the breached one
               3) Even if breach happened or not we have to reverse all the numbers(basically those numbers will be in ascending order) from idx+1

               //Eg:2,4,7,6,5,3,1 => 2 5 1 3 4 6 7
*/

class Solution124 {
    public void nextPermutation(int[] nums) {
        
        if(nums==null || nums.length==0) return;
        
        //TC:O(N), SC:O(1)
        //Eg:2,4,7,6,5,3,1
        
        //1) Find the Breach i.e the element smaller than the next element
        int idx = nums.length-2;
        while(idx>=0 && nums[idx]>=nums[idx+1]){
            idx--;
        }
        
        //2) If Breach happened, find the next greatest element from backwards and swap it with the breached one
        if(idx>=0){
            int j = nums.length-1;
            while(nums[idx]>=nums[j]){
                j--;
            }
            
            //got next greater element, swap that with the breached element
            swap(nums,idx,j);
        }
        
        //3) Even if breach happened or not we have to reverse all the numbers from idx+1
        reverse(nums,idx+1);
    
    }
    
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j]  = temp;
    }
    
    private void reverse(int[] nums,int i){
        int j = nums.length-1;
        
        while(i<=j){
          swap(nums,i,j);
          i++;
          j--;  
        }
        
    }
    
}