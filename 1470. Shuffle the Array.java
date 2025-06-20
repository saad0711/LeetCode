class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] new_arr = new int[2*n];
        for(int i =0; i<n; i++){
            new_arr[2*i] = nums [i];
            new_arr[2*i+1] = nums[i+n];
        }
        return new_arr;
    }
}
