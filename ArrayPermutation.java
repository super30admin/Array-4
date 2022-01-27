//Time complexity:O(n)
//Space Complexity:O(1)


public class ArrayPermutation {
    public void nextPermutation(int[] nums) {
        if(nums.length==0 || nums==null){
            return;
        }
        int n=nums.length;
        int k=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                k=i;
                break;
            }
        }
        if(k!=-1){
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[k]){
                    swap(nums,i,k);
                    break;
                }
            }
        }
        reverse(nums,k+1,n-1);
        
    }
    void swap(int nums[],int l, int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    void reverse(int nums[],int start ,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
