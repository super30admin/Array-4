// Time Complexity : O(N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :


class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n==1) return;
        //find i 
        int i= n-2;
        while(nums[i] >= nums[i+1]){
            i--;
            if(i==-1)break;
        }
        //find j
        int j=n-1;
        if(i>=0){
        while(nums[j]<=nums[i]){
            j--;
        } 
        
        //swap(i,j)
        System.out.println("i"+i+"  "+"j"+j);
        swap(nums,i,j);
        }
        System.out.println(Arrays.toString(nums));
        // reverse elements after ith index
        reverse(nums,i+1,n-1);
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    
}