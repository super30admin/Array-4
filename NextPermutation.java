/*
Time: O(N)
Space: O(1) no extra space is used
*/
class Solution {
    public void nextPermutation(int[] nums) {
     //Base case:
     if(nums==null || nums.length == 0){
         return;
     }
        
    //Logic
    // 1. Compare elements going from right to it's left index.
    // 2. Watch out for breach(meaning num which is not arranged lexicographically) nums[i]<nums[i+1]
    // 3. Now swap it with next larger num (on right if any)
    // Eg: 1234[5]99861 ==> 1234->[6]998[5]1 => then we go with 1234->899651 and so on
    // for this we keep going left; worst case until index is -1
    // So we do not need to simply swap at conflict; but we need to find the next larger number
    // So do another scan and figure out like this
        int n = nums.length;
        int temp = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                temp = i;
                break;
            }
        }
        if(temp!=-1){
            //Check more values on right side which are immediately higher than i
            for(int i=n-1; i>=0; i--){
                if(nums[i]>nums[temp]){
                    swap(nums, i, temp);
                    break;
                }
            } 
        }
        reverse(nums, temp+1, n-1);
    }
    
    private void reverse(int[] nums, int i, int j){
            while(i<j){
                swap(nums, i, j);
                i++;
                j--;
            }
    }
        
        private void swap(int[] nums, int l, int r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
}
