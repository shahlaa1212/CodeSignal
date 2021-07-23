fun countBlackCells(n: Int, m: Int) = countBlackCell(n, m)
fun countBlackCell(n:Int, m:Int) = n + m - 2 + gcd(n, m)
fun gcd(a:Int, b:Int):Int{
    var result = if (a == 0) b else gcd(b % a, a)
    return result
}
