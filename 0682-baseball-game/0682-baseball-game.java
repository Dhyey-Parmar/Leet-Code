class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack();
        for(int i=0;i<operations.length;i++){
            if(operations[i].matches("-?\\d+")){
                s.push(Integer.parseInt(operations[i]));
            }else if(operations[i].charAt(0)=='D'){
                s.push((s.peek()*2));
            }else if(operations[i].charAt(0)=='C'){
                s.pop();
            }else{
                int b=s.pop();
                int a=s.pop();
                s.push(a);
                s.push(b);
                s.push(a+b);
            }
        }
        int sum=0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }
}