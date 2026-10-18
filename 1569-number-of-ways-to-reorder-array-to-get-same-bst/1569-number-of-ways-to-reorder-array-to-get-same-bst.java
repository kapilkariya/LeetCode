class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    static final long MOD = 1_000_000_007L;
    long[][] comb = new long[1001][1001];

    public int numOfWays(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            comb[i][0] = comb[i][i] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }

        TreeNode head = new TreeNode(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            fill(nums[i], head);
        }

        return (int) ((dfs(head).ways - 1 + MOD) % MOD);
    }

    class Result {
        int size;
        long ways;

        Result(int size, long ways) {
            this.size = size;
            this.ways = ways;
        }
    }

    public Result dfs(TreeNode head) {
        if (head == null) {
            return new Result(0, 1);
        }

        Result left = dfs(head.left);
        Result right = dfs(head.right);

        int size = left.size + right.size + 1;

        long ways = comb[left.size + right.size][left.size];
        ways = ways * left.ways % MOD;
        ways = ways * right.ways % MOD;

        return new Result(size, ways);
    }

    public TreeNode fill(int num, TreeNode head) {
        if (head == null) {
            return new TreeNode(num);
        }

        if (num > head.val) {
            head.right = fill(num, head.right);
        } else if (num < head.val) {
            head.left = fill(num, head.left);
        }

        return head;
    }
}