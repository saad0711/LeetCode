class Solution {
    public int maxArea(int[] height) {
        int left_point = 0;
        int right_point = height.length-1;
        int max_area = 0;
        while(left_point<right_point){
            int current_area = Math.min(height[left_point], height[right_point]) * (right_point-left_point);
            max_area = Math.max(max_area,current_area);
            if(height[left_point] < height[right_point]){
                left_point++;
            }
            else{
                right_point--;
            }
        }
        return max_area;
    }
}
