fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {
    return a + b == c || a - b == c || a * b == c || ( a / b == c && a % b == 0 )
}
