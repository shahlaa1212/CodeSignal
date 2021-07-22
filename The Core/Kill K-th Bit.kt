int killKthBit(int n, int k) {
    return (n & (int)pow(2, k - 1)) == 0 ? n : n - (int)pow(2 , k - 1);
}
