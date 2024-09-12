// tc: O(n)
// sc: O(1)


class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        // find breach index traversing through n-1  element smnaller is breach
        int bi=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                bi=i-1;
               // System.out.print(bi);
                break;
            }
        }
        
        // finding next larger to nums[bi]
        if(bi!=-1){
            int gl=getlarger(nums,bi);
            //System.out.print(nums[gl]);
            swap(nums,bi,gl);
            
            reverse(nums,bi+1);
        }else{
            reverse(nums,0);
        }
        
        
    }
    private void reverse(int[] nums,int i){
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    private int getlarger(int[] nums,int bi){
        for(int i=nums.length-1;i>bi;i--){
            if(nums[i]>nums[bi]){
                return i;
            }
        }
        return 0;
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
