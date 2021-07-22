int equalPairOfBits(int n, int m) {
  return n = ~(n^m),n&(-n);
}
