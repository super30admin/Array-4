// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    int max;
    public int arrayPairSum(int[] nums) {
        max=Integer.MIN_VALUE;
        boolean[] track=new boolean[nums.length];
        int[] arr=new int[nums.length];
        generatePermutation(nums,arr,track,0);
        return max;
        
    }
    
     public void generatePermutation(int[] nums,int[] arr,boolean[] track,int index){
        if(index==nums.length){
           // System.out.println(Arrays.toString(arr));
            int i=0;
            int sum=0;
            while(i<arr.length-1){
                //System.out.println(arr[i]+","+arr[i+1]);
                sum=sum+Math.min(arr[i],arr[i+1]);
                i=i+2;
            }
            max=Math.max(max,sum);
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!track[i]){
                arr[index]=nums[i];
                track[i]=true;
                generatePermutation(nums,arr,track,index+1);
                track[i]=false;
            }
        }
    }
}
////////////////
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            sum=sum+nums[i];
        }
        return sum;
    }
}
