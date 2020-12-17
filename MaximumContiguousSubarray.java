package codes;

public class MaximumContiguousSubarray {
	//brute force
	 public int maxSubArray(int[] nums) {
         if(nums==null) return 0;
        // if(nums.length==1)return nums[0];
        int sum=nums[0];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int temp=0;
                for(int k=i;k<=j;k++){
                    temp+=nums[k];
                }
                sum=Math.max(sum,temp);
            }
        }
          return sum;
    }
	 
	 
	 
	 
	 // kadane's algo
	 
	 public int maxSubArray2(int[] nums) {
         if(nums==null) return 0;
        
        int max_so_far=nums[0];
        int max_ending_here=0;
    
        for(int i=0;i<nums.length;i++){
            
            //running sum which we reset to 0 if <0
            max_ending_here=max_ending_here+nums[i];
            
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }
            
            if(max_ending_here<0){
                max_ending_here=0;
            }
            
            
            
            
        }
        
        return max_so_far;
        
    }
   
    
}
