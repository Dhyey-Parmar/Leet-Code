class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int ans[]=new int[temperatures.length];
        stack.push(0);
            int n=0;
        for(int i=1;i<temperatures.length;i++){
            while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                n=stack.pop();
                ans[n]=i-n;
            }
            stack.push(i);
            
        }
        return ans;
    }
}