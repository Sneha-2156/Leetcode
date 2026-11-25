import java.util.*;
class Solution {
    static final long MOD = 1_000_000_007L;
    static final long BASE = 911382323L;
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        long[] power = new long[n+1];
        long[] prefix = new long[n+1];
        power[0] = 1;
        for(int i = 0 ; i < n ; i++){
            power[i+1] = power[i] * BASE % MOD;
            prefix[i+1] = (prefix[i] * BASE + nums[i]) % MOD;
        }
        int left = 1, right = n;
        int ans = n;
        while(left <= right){
            int mid = left + (right-left) / 2;
            HashMap<Long,Integer>map = new HashMap<>();
            for(int i = 0 ; i+mid <= n ;i++){
                long hash = (prefix[i+mid]-prefix[i] * power[mid] % MOD + MOD) % MOD;
                map.put(hash,map.getOrDefault(hash,0)+1);
            }
            boolean found = false;
            for(int cnt : map.values()){
                if(cnt == 1){
                    found = true;
                    break;
                }
            }
            if(found){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}