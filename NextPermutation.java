// // TC = O(n) -- using while loops
// Approach - 3 steps - Go till the breach element, then swap the breach element with the first greater element from the array end with the breach element, then reverse all the elements after breach element till the array end 
// class Solution {
//     public void nextPermutation(int[] nums) {
//         // find the breach element
//         int i = nums.length - 2;
//         while(i>=0 && nums[i]>=nums[i+1]){
//             i--;
//         }
//         // If nothing found i will automatically become -1;
//         int j = nums.length - 1;
//         if(i>=0){
//             while(nums[i]>=nums[j]){
//                 j--;
//             }
//             swap(nums,i,j);
//         }
//         reverse(nums,i+1,nums.length-1);

//     }

//     public void swap(int[] nums,int i, int j){
//         // swapping without using extra variable
//         if(i!=j){ // this needs to be else the below method results in 0 as answer
//             nums[i] = nums[i] + nums[j];
//             nums[j] = nums[i] - nums[j];
//             nums[i] = nums[i] - nums[j];
//         }
        
//     }

//     public void reverse(int[] nums, int left, int right){
//         while(left<=right){
//             swap(nums,left,right);
//             left++;right--;
//         }
//     }
// }
// TC = O(n) -- using for loops
class Solution {
    public void nextPermutation(int[] nums) {
        // find the breach element
        int secondLast = nums.length-2;
        int last = nums.length-1;
        int breachIdx = last;
        boolean isBreach = false;
        for(int i=secondLast;i>=0;i--){
            if(nums[i]<nums[i+1]){
                breachIdx = i;
                isBreach = true;
                break;
            }
        }
        if(!isBreach) {
            reverse(nums,0,last);
            return;
        }
       
        // Travel till the breach element to find the element to swap with the breach element
        for(int i=last;i>breachIdx;i--){
            if(nums[i]>nums[breachIdx]){
                swap(nums,i,breachIdx);
                break;
            }
        }
        reverse(nums,breachIdx+1,last);
    }

    public void swap(int[] nums,int i, int j){
        // swapping without using extra variable
        if(i!=j){ // this needs to be else the below method results in 0 as answer
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
        
    }

    public void reverse(int[] nums, int left, int right){
        while(left<=right){
            swap(nums,left,right);
            left++;right--;
        }
    }
}