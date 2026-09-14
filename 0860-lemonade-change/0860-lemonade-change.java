class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum5=0;
        int sum10=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) sum5+=5;
            if(bills[i]==10){
                if(sum5==0) return false;
                sum5-=5;
                sum10+=10; 
            }
            if(bills[i]==20){
                if(sum5==0) return false;
                if(sum10==0){
                    if(sum5<15){
                        return false;
                    }else{
                        sum5-=15;
                        continue;
                    }
                }
                sum5-=5;
                sum10-=10; 
            }
        }
        return true;
    }
}