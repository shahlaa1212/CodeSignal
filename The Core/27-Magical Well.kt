fun magicalWell(a: Int, b: Int, n: Int): Int {
    var total = 0
    var a = a
    var b = b
    for(i in 0 until n)
    {
        total = a * b + total
        a++
        b++
    }
    return total;
}
