class Solution {
    public int majorityElement(int[] nums) {
        int candit = 0, cnt =0;
        for( int num : nums){
            if(cnt ==0){
                candit = num;
            }
            cnt += (num == candit) ? 1 : -1;
        }
        return candit;
    }
}