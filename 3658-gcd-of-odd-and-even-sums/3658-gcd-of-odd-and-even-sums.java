class Solution {
    int GCD(int a,int b){
        if(b==0)return a;
        return GCD(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        return GCD(n*n,(n*(n+1)));
    }
}