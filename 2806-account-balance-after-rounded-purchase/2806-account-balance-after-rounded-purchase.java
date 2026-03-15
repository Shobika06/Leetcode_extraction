class Solution {
    public int accountBalanceAfterPurchase(int amt) {
        int x = ((amt + 5) / 10) * 10;
        int val = 100 - x;
        return val;
    }
}