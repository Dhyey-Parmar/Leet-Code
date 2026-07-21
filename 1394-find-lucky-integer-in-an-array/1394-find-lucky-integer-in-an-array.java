class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int count=1,currLucky=-1;
        for(int i=0;i<arr.length-1;i++){
            
            if(arr[i]==arr[i+1]) count++;
            else{
                if (count == arr[i]) {
                    currLucky = arr[i];
                }
                count = 1;
            }
        }
        if (count == arr[arr.length - 1]) 
        {
            currLucky = arr[arr.length - 1];
        }
        return currLucky;
    }
}