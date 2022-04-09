//Tc: O(n)

class Solution {
    public void nextPermutation(int[] nums) {
     
        for(int i= nums.length-2 ; i >=0 ; i--)
        {
            
            if(nums[i] < nums[i+1])
            {
                //not in desce
               int j = nums.length-1;               
                while(j > i)
                {
                    if(nums[j] > nums[i])
                    {
                        break;
                    }
                    --j;
                }
                
                swap(nums, i , j);
                reverse(nums , i+1, nums.length-1);
                return;
            }
             
                
        }
                 
            //for 321
            reverse(nums , 0 , nums.length-1);
    }
    
    private void swap(int[] nums, int i , int j)
    {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
    
    private void reverse(int[] nums , int l , int r)
    {
        while(l < r)
        {
         swap(nums, l, r);
            ++l;
            --r;
        }
          
    }
}
