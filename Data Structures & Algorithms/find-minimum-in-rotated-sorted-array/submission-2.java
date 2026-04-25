class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1,mid, result;
        if(nums[l]<nums[r]) return nums[l];
        result = nums[r];
        while(l<r){
            mid = (l+r)/2;
            if(nums[mid]<nums[l]){
                result = nums[mid];
                r=mid;
            } else if(nums[mid]>nums[l]){
                l = mid;
            } else{
                result = Math.min(nums[l], nums[r]);
                break;
            }
        }
        return result;
    }
}
