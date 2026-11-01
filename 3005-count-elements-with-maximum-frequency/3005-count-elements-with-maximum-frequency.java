class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int count = 0;

        for (int freq : map.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
                count = freq;
            } 
            else if (freq == maxFreq) {
                count += freq;
            }
        }

        return count;
    }
}