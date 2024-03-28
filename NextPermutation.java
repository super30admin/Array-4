package week10.day2;

//TC - O(n) n is length of array
//TC - O(1) due to constraint nums.length <= 100 (only 100 elements)
class Solution {
  public void nextPermutation(int[] nums) {
      int len = nums.length;
      int x = -1;
      for(int i=len-1; i>0;i--){
          if(nums[i-1]<nums[i]){
              x =i-1;
              break;
          }        
      }
      if(x==-1){
          nums = sort(0,nums);
      }  
      else{
          int end =0;
          for(int j=len-1;j>=x;j--){
              if(nums[j]>nums[x]){
                  end = j;
                  break;
              }
                  
          }
          nums = swap(x,end,nums);
          nums = sort(x+1,nums);
      }
          
  }

  private int[] swap(int start,int end,int[] nums) {
      if(start!=end){
           nums[start] =  nums[start] + nums[end];
           nums[end] = nums[start] - nums[end];
           nums[start] =  nums[start] - nums[end];
      }
          //int temp = nums[start];
         // nums[start] = nums[end];
          //nums[end] = temp;
      return nums;
  }
  private int[] sort(int start,int[] nums) {
      int end = nums.length-1;
      while(start<=end && nums[start]>nums[end]){
          nums = swap(start,end,nums);
          start++;
          end--;
      }
      return nums;
  }
}
public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,2};
		Solution s = new Solution();
		s.nextPermutation(nums);
	}

}
