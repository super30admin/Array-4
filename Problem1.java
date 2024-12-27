import java.util.*;
class Problem1 {
    //TC:O(N) + O(max)
    public int arrayPairSum(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int maxSum =0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //TC:O(N)
        //SC :O(N)
        for(int num : nums){
            if(!freq.containsKey(num)){
                freq.put(num,0);
            }
            int curFreq = freq.get(num);
            freq.put(num,curFreq+1);
            min = Math.min(min,num);
            max = Math.max(max,num);
        }

        //
        boolean isPrevOdd = false;
        //TC:O(max)
        for(int i = min;i<=max;i++){
            if(!freq.containsKey(i)) continue;
            int curFreq = freq.get(i);
            if(isPrevOdd){
                freq.put(i,curFreq--);
                isPrevOdd = false;
            }

            if(curFreq%2 == 0 )//even freq
            {
                maxSum+=curFreq/2*i;

            }else{
                //odd frequency
                maxSum+=curFreq/2*i;
                //ince it is odd we have to use the current extra one
                // as it will be minimum from the pair and reduce the count of the
                //the next number to form the pair
                maxSum+=i;
                isPrevOdd = true;
            }
        }

        return maxSum;

    }
}