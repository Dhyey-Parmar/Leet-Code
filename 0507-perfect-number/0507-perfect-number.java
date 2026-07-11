class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int divSum=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                divSum+=i;
            }
        }
        if(divSum==num) return true;
        return false;
    }
}