// Bottom-up/Iterative/Tabulation method 
// - First we used and array then we optimised it to using 3 variable for storing the last three numbers
// - We are following a btm-up tree (logically) the root- tribo(n)  is at the bottom

class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        return c;
    }
}
