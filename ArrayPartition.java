import java.util.HashMap;

//TC-O(n) +O(k), where
//k is the number of distinct values in the range [min, max].
// In practice, this is much smaller than n for most input cases. o(n+k).
//SC-O(n)
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int ans=0;
        int prevodd=min-1;
        for(int i=min;i<=max;i++){
            if(!freq.containsKey(i))continue;
            int count=freq.get(i);
            int pairCount=count/2;
            ans=ans+i*pairCount;
            if(count%2 !=0){
                if(prevodd==min-1){
                    prevodd=i;
                }else{
                    ans=ans+Math.min(prevodd,i);
                    prevodd=min-1;
                }
            }
        }
        return ans;
    }
}
