class Solution {
    public long sumAndMultiply(int n) {
        int temp=n;
        long x=0,sum=0;
        while(temp!=0){
            if(temp%10!=0)
            {
            x=x*10+temp%10;
            sum+=temp%10;
            }
            temp/=10;
        }
        long temp1=x;
        x=0;
        while(temp1!=0){
            
            x=x*10+temp1%10;
            temp1/=10;
        }
        return x*sum;
    }
}