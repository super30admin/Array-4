// TIme Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1) return;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        
        int j=nums.length-1;
        if(i>=0){
        while(j>=0 && nums[j]<=nums[i]){
            j--;
        }    
            swap(nums,i,j);
            
        }
     reverse(nums,i+1,nums.length-1);   
    }
    
    public int[] swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    
    public int[] reverse(int[] arr, int i,int j){
        while(i<j){
            swap(arr,i,j);
            i=i+1;
            j=j-1;
        }
        return arr;
    }
}
