class Solution {
    public int maxArea(int[] height) {
     int lft=0, rht=height.length-1;
     int max=0;
     while(lft<rht){
        int h=Math.min(height[lft],height[rht]);
        int b=rht-lft;
        int area=b*h;
        max=Math.max(max,area);
        if(height[lft]<height[rht]) lft++;
        else rht--;
     }   
     return max;
    }
}
