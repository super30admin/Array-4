
public class NextPermutation {

	// Time O(N)
	//Space O(1)
	
	 public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i] >= nums[i+1])
            i--;
        if(i<0)
            reverse(nums,0,nums.length-1);
        else{
           int j=nums.length-1;
           int num = nums[i];
           int min=Integer.MAX_VALUE;
           int k=nums.length-1;
           while(j>i){
               if(nums[j]< min && nums[j]>num){
                min = nums[j];
                k=j;
               }
               j--;
           } 
           swap(nums,i,k);
           reverse(nums,i+1,nums.length-1);
        }    
    }

    public void reverse(int[] nums,int i,int j){
       
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }


    public void swap(int[] arr,int i, int j){
         int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
}
