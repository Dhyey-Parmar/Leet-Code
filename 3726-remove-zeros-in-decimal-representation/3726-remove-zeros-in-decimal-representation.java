class Solution {
    public long removeZeros(long n) {
        long ans=0;
        while(n!=0){
            if(n%10!=0) ans=ans*10+(n%10);
            n/=10;
        }
    long rev=0;
        while (ans > 0) {
    rev = rev * 10 + ans % 10;
    ans /= 10;
}
    return rev;
    }
}