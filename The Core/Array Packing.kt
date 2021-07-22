fun arrayPacking(a: MutableList<Int>): Int {
    var res = 0
    for(i in 0 until a.size)
    {
        res += a[i] shl (8) * i
    }
    return res
}
