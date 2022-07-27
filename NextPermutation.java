//Time Complexity=O(n)
//Space Complexity=O(1)
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n==0 || nums==null) return;
        int breach=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                breach=i;
                break;
            }
        }
        int j=n-1;
        while(breach!=-1 && j>=0){
            if(nums[j]>nums[breach]){
                swap(nums,j,breach);
                break;
            }
            j--;
        }
        reverse(nums,breach+1,n-1);
    }

    public void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    public void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
