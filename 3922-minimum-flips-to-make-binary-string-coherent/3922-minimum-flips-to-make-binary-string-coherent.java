class Solution {
    public int minFlips(String s) {
        String tempinput = s;

        int n = s.length();
        int zeros = 0;
        int ones = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros++;
            } else {
                ones++;
            }
        }
        int ans = ones;   
        ans = Math.min(ans, zeros);
        if (ones >= 1) {
            ans = Math.min(ans, ones - 1);
        }
        if (n >= 2 && ones >= 2) {
            int cost = ones;
            if (s.charAt(0) == '1') {
                cost--;
            }
            if (s.charAt(n - 1) == '1') {
                cost--;
            }
            ans = Math.min(ans, cost);
        }

        return ans;

    }
}