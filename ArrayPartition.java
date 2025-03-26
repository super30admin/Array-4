class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        int sum = 0;
        boolean flag = true;
        
        for (int i = min; i <= max; i++) {
            int count = freqMap.getOrDefault(i, 0);
            while (count > 0) {
                if (flag) {
                    sum += i;
                }
                count--;
                flag = !flag;
            }
        }

        return sum;
    }

}

//Time Complexity: O(n)
//Space Complexity: O(n)
