class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;

        List<Integer>[] tree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            tree[parent[i]].add(i);
        }

        int[] newParent = parent.clone();
        int[] last = new int[26];

        Arrays.fill(last, -1);

        dfs(0, tree, newParent, last, s);

        List<Integer>[] newTree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            newTree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            newTree[newParent[i]].add(i);
        }

        int[] ans = new int[n];

        calculateSize(0, newTree, ans);

        return ans;
    }

    private void dfs(int node, List<Integer>[] tree,
                     int[] newParent, int[] last, String s) {

        int ch = s.charAt(node) - 'a';

        int previous = last[ch];

        if (previous != -1) {
            newParent[node] = previous;
        }

        last[ch] = node;

        for (int child : tree[node]) {
            dfs(child, tree, newParent, last, s);
        }

        last[ch] = previous;
    }

    private int calculateSize(int node,
                              List<Integer>[] tree,
                              int[] ans) {

        ans[node] = 1;

        for (int child : tree[node]) {
            ans[node] += calculateSize(child, tree, ans);
        }

        return ans[node];
    }
}