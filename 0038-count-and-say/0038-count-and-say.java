class Solution {
    public String countAndSay(int n) {
        String s = "1";
        return dfs(n, s);
    }

    public String dfs(int n, String s) {
        if (n == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        char c = 'a';
        int ct = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != c) {
                if (ct != 0 || c != 'a') {
                    sb.append(ct);
                    sb.append(c);
                }
                if (i == s.length())
                    break;
                ct = 1;
                c = s.charAt(i);
            } else {
                ct++;
            }
        }
        return dfs(n - 1, sb.toString());
    }
}