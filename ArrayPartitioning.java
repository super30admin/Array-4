//Sort the array and take the alternate elements starting from the index 0. Since the array has 2n elements , this will give minimum elements from n pairs in such a way that the sum of these elements is maximised.
//Time O(nlogn +n) nlogn for sorting and n for traversing 
// Space O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null)
            return 0;
        Arrays.sort(nums);
        int sum=0;
        int count=0;
        for(int i :nums)
        {
            if(count%2==0)
                sum+=i;
            count++;
        }
        return sum;
    }
}