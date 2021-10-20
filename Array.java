import java.util.*;
public class Array{
    //time complexity : N
    //space complexity : 1
    // did it run on leetcode : yes
    // any doubts : no
    //https://leetcode.com/problems/maximum-subarray/submissions/
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int rsum = nums[0];
        int start =0;
        int end =0;
        int currst = 0;
        for(int i =1;i<nums.length;i++){
            rsum = Math.max(nums[i],rsum+nums[i]);
            // if(rsum < nums[i])
            // {
            //   rsum = nums[i];  
            //   currst = i;  
            // }else{
            //     rsum = rsum+nums[i];
            // }
            
            max =  Math.max(max,rsum);
            // if(max<rsum){
            //     start = currst;
            //     end = i;
            //     max = rsum;
            // }
           
        }
        System.out.println(start+" "+end);
        return max;
        
    }

    // time complexity : N
    // space complexity : 1
    // did it run on leetcode : yes
    // any doubts : no
    // https://leetcode.com/problems/next-permutation/submissions/
    public void nextPermutation(int[] nums) {
        //find breach
        int i =nums.length-2;
        int end = nums.length-1;
        while(i>=0 && nums[i]>=nums[i+1]){
         
            i--;
        }
        // swap with next greatest
        if(i>=0){
            while(nums[end]<=nums[i]){
                
                end--;
            }
            swap(nums,i,end);
        }
        // reverse
        reverse(nums,i+1,nums.length-1);
        
        
    }
    
    private void reverse(int nums[],int i,int j){
        while(i<j){
            swap(nums, i,j);
            i++;
            j--;
        }
        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }

    //time complexity : nlogn
    //space complexity : 1
    //did it run on leetcode : yes
    // any doubts: no
    //https://leetcode.com/problems/array-partition-i/
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
        for(int i =nums.length-1;i>=0;i=i-2){
            sum = sum + nums[i-1];
        }
        return sum;
    }
}