//Time Complexity: O(nlogn)
//Space Complexity: O(n)
class Solution {
    public int arrayPairSum(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int maxSum = 0;
        for(int num: nums)
        {
            pq.add(num);
        }

        while(!pq.isEmpty())
        {
            maxSum+= pq.poll();
            pq.poll();
        }
        return maxSum;

    }
}