/*Time Complexity : O(N)
Space Complexity : O(1)
Did it run on LeetCode : yes
Any problems :No
*/

public class Solution {
public int maxSubArray(int[] A) {
    int result=A[0];
    int i,j,sum=0;
    
    for(i=0;i<A.length;i++)
    {       sum+=A[i]; // Get the running sum.
            result=Math.max(sum,result); // Compare running sum with current result value.
            sum=Math.max(sum,0); // If running sum is less than 0, make it 0.
        }
        return result;
}
}

