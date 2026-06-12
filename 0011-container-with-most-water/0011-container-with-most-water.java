class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, area = 0;

        while(left < right){
            int loc_area = (right - left)*Math.min(height[left], height[right]);
            area = Math.max(area, loc_area);
            if(height[right] > height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}