


public class NextPermutation {

	public void nextPermutation(int[] nums) {
        int x=0;
        
        for( int i=nums.length-1;i>=1;i--){
            
            if(nums[i-1]<nums[i]){
                
                x=i-1; break;
                
        }
            
            }
      //System.out.println(x);
        int y=Integer.MAX_VALUE;
        int ind=0;
        
        for( int j=x+1;j<nums.length;j++ ){
          //  System.out.println(j+"*");
            if(nums[j]>nums[x]&&nums[j]<=y){
                
                y=nums[j];
                ind=j;
            }
            
        }
     // System.out.println(ind);
        
 if(x==0&&ind==0){reverse(nums,0,nums.length-1);return;}
int temp=nums[x];
nums[x]=nums[ind];
nums[ind]=temp;            
   
        
    int p1=x+1;
    int p2=nums.length-1;
   reverse(nums,p1,p2);     
      

        
      
    }
    
    public void reverse(int[] nums, int start, int end){
        
        
                 
            
    int p1=start;
int p2=end;
        while(p1<p2){
         int temp1=nums[p1];
nums[p1]=nums[p2];
nums[p2]=temp1;   
            p1++;
            p2--;
            
        }

    }
	
	
}
