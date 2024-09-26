package sol;


public class MaxSubarray {
public int maxSubArray(int[] nums) {
        
        int calc=0;
        int sum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            
            calc=calc+nums[i];
            
            
            
            if(calc>sum){
                
                sum=calc;
            }
            
            if(calc<0){calc=0;}
            
        }
        
        return sum;
        
    }
	
	
}
