class Solution {
    public static int  digit(int n){
        int count=0;
        while(n!=0){
            count+=(n%10);
            n/=10;
        }
        return count;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
         int d=0,max=0;
         for(int i=1;i<=n;i++){
            d=digit(i);
            map.put(d,map.getOrDefault(d,0)+1);
         }
         for (int value : map.values()) {
            max = Math.max(max, value);
        }

        int ans = 0;

        for (int value : map.values()) {
            if (value == max) {
                ans++;
            }
        }
         return ans;
    }
}