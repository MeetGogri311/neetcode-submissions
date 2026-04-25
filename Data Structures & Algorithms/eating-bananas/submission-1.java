class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0, right = 0;
        int result, i, hours;
        for(i=0;i<piles.length;i++){
            right = Math.max(right, piles[i]);
        }
        result = right;
        while(left < right-1){
            // System.out.printf("Left: %d, Right: %d\n", left, right);
            int mid = (left + right)/2;
            hours = 0;
            for(i=0;i<piles.length;i++){
                hours += piles[i]/mid;
                if(piles[i]%mid > 0){
                    hours++;
                }
                if(hours > h) break;
            }
            if(hours > h){
                if(left == mid) break;
                left = mid;
            } else{
                result = mid;
                right = mid;
            }
        }
        return result;
    }
}
