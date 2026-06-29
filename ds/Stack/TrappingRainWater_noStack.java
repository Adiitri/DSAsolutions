// BRUTE FORCE t.c= O(n)  s.c= O(2n)

class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int lmax=0;
        int rmax=0;
        int sum=0;
        int[] lg=new int[len];
        int[] rg=new int[len];
        for(int i=len-1;i>=0;i--){
            rg[i]=rmax;
            if (height[i]>rmax){
                rmax=height[i];
            }
        }
        for(int i=0;i<len;i++){
            lg[i]=lmax;
            if (height[i]>lmax){
                lmax=height[i];
            }
        }
        
        for(int i=0;i<len;i++){
            int water = Math.min(rg[i], lg[i]) - height[i];
            if (water > 0) {
             sum = sum + water;
            }
           // sum=sum+(Math.min(rg[i],lg[i])-height[i]);
        }
        return sum;
    }
}
