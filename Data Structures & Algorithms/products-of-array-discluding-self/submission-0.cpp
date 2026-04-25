class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int product = 1, i, nz = 0;
        for(i=0;i<nums.size();i++) {
            if(nums[i] == 0){
                nz++;
                continue;
            }
            product *= nums[i];
        }
        vector<int> result(nums.size());
        for(i =0; i<nums.size();i++){
            if((nz > 0 && nums[i] != 0) || nz > 1) result[i] = 0;
            else if(nums[i] == 0) result[i] = product;
            else result[i] = product/nums[i];
        }
        return result;
    }
};
