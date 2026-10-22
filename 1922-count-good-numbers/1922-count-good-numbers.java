class Solution {
    public int countGoodNumbers(long n) {
        long ans = 1;
        long mod = 1000000007L;
        if (n % 2 == 0)
            ans = pow(20, (long) n / 2, mod);
        else {
            ans = pow(20, (long) n / 2, mod);
            ans = ((ans * 5) % mod);
        }
        return (int) ans;
    }

    public long pow(long b, long n, long mod) {
        long ct = 1;
        long a = b;
        while (n > 0) {
            if (n % 2 == 1) {
                ct = (ct * b) % mod;
            }
            b = (b * b) % mod;
            n /= 2;
        }
        return ct;
    }
}