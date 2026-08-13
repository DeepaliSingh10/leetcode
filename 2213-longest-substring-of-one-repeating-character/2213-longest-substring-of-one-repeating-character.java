class Solution {

    class Node {
        char leftChar, rightChar;
        int prefix, suffix, best, len;

        Node(char leftChar, char rightChar, int prefix,
             int suffix, int best, int len) {
            this.leftChar = leftChar;
            this.rightChar = rightChar;
            this.prefix = prefix;
            this.suffix = suffix;
            this.best = best;
            this.len = len;
        }
    }

    Node[] tree;
    String s;

    Node merge(Node a, Node b) {

        Node res = new Node(
            a.leftChar,
            b.rightChar,
            0, 0, 0,
            a.len + b.len
        );

        // Prefix
        res.prefix = a.prefix;

        if (a.prefix == a.len && a.rightChar == b.leftChar) {
            res.prefix = a.len + b.prefix;
        }

        // Suffix
        res.suffix = b.suffix;

        if (b.suffix == b.len && a.rightChar == b.leftChar) {
            res.suffix = b.len + a.suffix;
        }

        // Best
        res.best = Math.max(a.best, b.best);

        if (a.rightChar == b.leftChar) {
            res.best = Math.max(
                res.best,
                a.suffix + b.prefix
            );
        }

        return res;
    }

    void build(int index, int left, int right) {

        if (left == right) {
            tree[index] =
                new Node(s.charAt(left), s.charAt(left),
                         1, 1, 1, 1);
            return;
        }

        int mid = (left + right) / 2;

        build(index * 2, left, mid);
        build(index * 2 + 1, mid + 1, right);

        tree[index] =
            merge(tree[index * 2], tree[index * 2 + 1]);
    }

    void update(int index, int left, int right,
                int pos, char ch) {

        if (left == right) {
            tree[index] =
                new Node(ch, ch, 1, 1, 1, 1);
            return;
        }

        int mid = (left + right) / 2;

        if (pos <= mid) {
            update(index * 2, left, mid, pos, ch);
        } else {
            update(index * 2 + 1, mid + 1, right, pos, ch);
        }

        tree[index] =
            merge(tree[index * 2], tree[index * 2 + 1]);
    }

    public int[] longestRepeating(String s,
                                  String queryCharacters,
                                  int[] queryIndices) {

        this.s = s;

        int n = s.length();

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        for (int i = 0; i < queryIndices.length; i++) {

            int pos = queryIndices[i];
            char ch = queryCharacters.charAt(i);

            update(1, 0, n - 1, pos, ch);

            ans[i] = tree[1].best;
        }

        return ans;
    }
}