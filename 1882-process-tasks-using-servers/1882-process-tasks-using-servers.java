import java.util.*;
class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;
        PriorityQueue<Integer> available = new PriorityQueue<>((a, b) -> {
            if (servers[a] != servers[b]) {
                return Integer.compare(servers[a], servers[b]);
            }
            return Integer.compare(a, b);
        });
        PriorityQueue<long[]> busy = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Long.compare(a[0], b[0]);
            }
            return Long.compare(a[1], b[1]);
        });
        for (int i = 0; i < n; i++) {
            available.offer(i);
        }
        int[] result = new int[m];
        long time = 0;
        for (int i = 0; i < m; i++) {
            time = Math.max(time, i);
            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                available.offer((int) busy.poll()[1]);
            }
            if (available.isEmpty()) {
                time = busy.peek()[0];

                while (!busy.isEmpty() && busy.peek()[0] <= time) {
                    available.offer((int) busy.poll()[1]);
                }
            }
            int server = available.poll();
            result[i] = server;
            busy.offer(new long[]{time + tasks[i], server});
        }
        return result;
    }
}