//TC -O(n);
//SC -O(1);

class Solution {
    public void nextPermutation(int[] nums) {
        int p = nums.length-1;
        boolean flag = true;
        for(int i=p;i>0;i--){
            if(nums[i]>nums[i-1]){
                int j = p;
                while (nums[j] <= nums[i-1] ) {
                    j--;
                }
                
                swap(nums,i-1,j);
                reverse(nums,i);
                flag=false;
                break;
            }
        }
        
        if(flag==true){
            reverse(nums,0);
        }
    }
    public void reverse(int [] arr, int s){
        int i=s,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    

    public void swap(int[] arr,int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}