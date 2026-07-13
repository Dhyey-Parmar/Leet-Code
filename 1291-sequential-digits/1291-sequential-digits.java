class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> l1=new ArrayList<>();
        for (int start = 1; start <= 9; start++) {
            int num = start;
            int next = start + 1;

            while (next <= 9) {
                num = num * 10 + next;

                if (num > high)
                break;
                
                if (num >= low && num <= high)
                    l1.add(num);

                next++;
            }
        }
        Collections.sort(l1);
        return l1;
    }
}