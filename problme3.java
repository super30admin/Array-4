package Array-4;

public class problme3 {
    class Solution {
        //TC:- O(n)
        //SC:- O(1)
        public void nextPermutation(int[] nums) {
            if(nums == null || nums.length == 0) return;
            
            int index = -1;
            int n = nums.length;
            
            //Step 1 - check for smaller 
            for(int i = n - 2; i >= 0; i--){
                if(nums[i] < nums[i+1]){
                    index = i;
                    break;
                }
            }
            
            //step 2:- check for just greater number then nums[index]
            if(index != -1){
                for(int i = n - 1; i >= index; i--){
                    if(nums[i] > nums[index]){
                        swap(nums, i, index);
                        break;
                    }
                }
            }
            
            //step 3:- reverse from index + 1 till end
            reverse(nums, index + 1, n - 1);
            
        }
        
        public void swap(int[] nums, int l, int r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        
        public void reverse(int[] nums, int l, int r){
            while(l<=r){
                swap(nums, l, r);
                l++;
                r--;
            }
        }
    }
}
