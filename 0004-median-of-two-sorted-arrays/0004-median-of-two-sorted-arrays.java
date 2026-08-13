class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=0,b=0;
        int n[]=new int[nums1.length+nums2.length];
        int nind=0;
        while((a<nums1.length)&&(b<nums2.length)){
            if(nums1[a]<nums2[b]){ 
                n[nind++]=nums1[a];
                a++;
            }else{
                n[nind++]=nums2[b];
                b++;
            } 
        }
        if(a!=nums1.length){
            while(a!=nums1.length){
                n[nind++]=nums1[a];
                a++;
            }
        }else{
            while(b!=nums2.length){
                n[nind++]=nums2[b];
                b++;
            }
        }
        if((a+b)%2==0){
            return (n[(int)Math.ceil((a+b)/2)]+n[(int)Math.ceil((a+b)/2)-1])/2.0;
        }
    return n[(int)Math.ceil((a+b)/2)];    
    }
}