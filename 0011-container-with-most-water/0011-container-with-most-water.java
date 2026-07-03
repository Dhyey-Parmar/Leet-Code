class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,area=0,curArea=0;
        
        while(left!=right){
            curArea=Math.min(height[left],height[right])*(right-left);
                area=Math.max(area,curArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}