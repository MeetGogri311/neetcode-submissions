class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1, mid;
        while(left < right){
            mid = (left + right)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                if(nums[left] > target && nums[mid] > nums[right]){
                    left = mid + 1;
                } else{
                    right = mid;
                }
            }
            else{
                if(nums[right] >= target || nums[mid] > nums[right]){
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        return nums[left] == target? left : -1;
    }
}
