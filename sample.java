//Problem 1 Trap Rain Water
// Time Complexity :O(min - max)
// Space Complexity :O(max-min)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Sort array and add all even indexed elements to get maximum sum.
class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            min=Math.min(min, nums[i]);
            max=Math.max(max, nums[i]);
        }
        int res=0;
        boolean flag=false;
        for(int i=min;i<=max;i++){
            if(map.containsKey(i)){
                if(flag){
                    map.put(i, map.get(i)-1);
                }
                    
                int cnt=map.get(i);
                int pairs= cnt/2;
                res+=pairs*i;

                if(cnt%2==0) flag=false;
                else{
                    flag=true;
                    res+=i;
                    // map.put(i,1);
                }
            }
        }
        return res;


        // Arrays.sort(nums);
        // int res=0;
        // for(int i=0;i<nums.length;i+=2)
        //     res+=nums[i];
        // return res;
    }
}

//Problem 2 Max SubArray
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// at each given element, check the partition, and check current sum, if we get a better one going ahead, consider the new partition then,
// Better solution would be to check the sum all the times adding nums[i] and checking with max, if sum<0 add make it zero for next iteration.
class Solution {
    public int maxSubArray(int[] nums) {
        
        //dp with variables
        // int n = nums.length;
        // int max=nums[0];
        // int curSum=0;
        // for(int i=0;i<n;i++){
        //     curSum=Math.max(0,curSum)+nums[i];
        //     max=Math.max(max,curSum);
        // }
        // return max;

        //dp without variables
        // for(int i=1;i<n;i++){
        //     nums[i]=Math.max(nums[i-1]+nums[i],nums[i]);
        //     max=Math.max(max,nums[i]);
        // }
        // return max;
        
    //simple solution
    // int maximum = Integer.MIN_VALUE, sum=0, n=nums.length;
    // for(int i=0;i<n;i++){
    //     sum+=nums[i];
    //     maximum=Math.max(maximum,sum); //if prev sum was higher, sum will remain the same. 
        
    //     if(sum<0) sum=0;  //any given point, sum<0 then assign to 0
    // }
    //     return maximum;

    int max=nums[0];
    int sum=nums[0];
    int st=0, end=0, curst=0;

    for(int i=1;i<nums.length;i++){
        sum+=nums[i];
        if(sum<nums[i]){
            sum=nums[i];
            curst=i;
        }

        if(max<sum){
            max=sum;
            st=curst;
            end=i;
        }
    }
    return max;

    }
}

//Problem 3 Find next permutation
// Time Complexity :O(constant)
// Space Complexity :O(constant)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//do it in 3 steps, find breach, swap eligible digit, reverse the numbers from swapped string
class Solution {
    //O(constant) O(constant)
    public void nextPermutation(int[] nums) {
        if(nums==null) return;

        //step 1: Find breach
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        //Step 2: Find digit to replace/swap the array with.
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i])
                j--;
            
            swap(nums, i, j);
        }
        //step 3: reverse
        reverse(nums, i+1, nums.length-1);
    }
    private void reverse(int[] arr, int l, int r){
        while(l<r){
            swap(arr, l, r);
            l++;
            r--;
        }
    }
    private void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}