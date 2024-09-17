/**
 * Time Complexity : O(n) where n is the number of elements
 * Space Complexity : O(1)
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){return;}
        int j = nums.length-1;
        int i;
        for(i = nums.length-2; i>=0; i--){
            if(nums[i+1] > nums[i]){                                                    
                break;
            }
            }
        if(i>=0){                                                                   
        while(j >=0 && nums[j] <= nums[i]){
            j--;                                                                    
        } 
            swap(nums, i,j);                                                            
        }
        reverse(nums, i+1);                                                                 
        }
    private void swap(int[] nums, int i, int j){                                                    
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private void reverse(int[] nums, int i){                                                        
        int j = nums.length-1;
        while(i < j){
            swap(nums, i,j);
            i++;
            j--;
        }
    } 
}