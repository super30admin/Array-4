/*Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
TC O(N) SC O(1)
*/
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        int j = -1;
        for (int i = n-1; i > 0; i --) {
            if (nums[i-1] < nums[i]){
                j = i-1;
                break;
            }
        }
        if ( j > -1 ) {
            for (int i = n-1; i >0 ; i--){
                if (nums[j] < nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    break;
                }    
            }    
        }
        
        int k = j+1;
        int m = n-1;
        while (k < m){
            int temp = nums[m];
            nums[m] = nums[k];
            nums[k] = temp;
            k++;
            m--;
        }  
    }
}
