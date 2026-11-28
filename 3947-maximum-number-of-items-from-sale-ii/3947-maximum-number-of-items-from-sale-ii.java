class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int maxFactor = n;
        int[] freq = new int[maxFactor + 1];
        for (int[] item : items) {
            freq[item[0]]++;
        }
        int[] divisibleCount = new int[maxFactor + 1];
        for (int f = 1; f <= maxFactor; f++) {
            for (int multiple = f; multiple <= maxFactor; multiple += f) {
                divisibleCount[f] += freq[multiple];
            }
        }
        Arrays.sort(items, (a, b) -> Integer.compare(a[1], b[1]));
        int minPrice = items[0][1];
        for (int[] item : items) {
            item[0] = divisibleCount[item[0]] - 1;
        }
        long remainingBudget = budget;
        long answer = 0;
        for (int[] item : items) {
            int gain = item[0];
            int price = item[1];
            if (gain <= 0 || price > 2L * minPrice) {
                continue;
            }
            long count = Math.min(gain, remainingBudget / price);
            answer += count * 2;
            remainingBudget -= count * price;
        }
        answer += remainingBudget / minPrice;
        return (int) answer;

    }
}