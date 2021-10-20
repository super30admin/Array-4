/***
LeetCode- 31
Time Complexity -O(n)
Space Complexity -O(1)
***/
class Solution {
    public void nextPermutation(int[] nums) {
        int first=0;
        int second = nums.length-1;
        boolean breachFound=false;
        //O(n)
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1])
            {
                System.out.println("Found a breach");
                breachFound = true;
                first = i-1;
                //O(n) in worst case
                while(nums[first]>=nums[second])
                {
                    second --;
                }
                //O(1)
                swap(nums,first,second);
                //O(n) in worst case
                reverse(nums,first+1,nums.length-1);
                break;
            }
           
        }
        if(!breachFound){     
            reverse(nums,first,nums.length-1);
        } 
    }
    private void swap(int[] nums,int i,int j)
    {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    } 
    
    private void reverse(int[] nums,int i,int j)
    {
      while(i<j)
      {
          swap(nums,i,j);
          i++;
          j--;
      }
    } 
    
}