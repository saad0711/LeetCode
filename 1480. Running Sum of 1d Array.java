class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int first_index = nums[0];
        for (int i = 1; i < len; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
