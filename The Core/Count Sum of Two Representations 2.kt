fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
    var a = 0
    var b = 0
    var count = 0
    if (n - l > r)
    {
        a = n - r
        b = r
    }
    else {
        a = l
        b = n - a
    }
    while (a <= b && b <= r){
        count++
        a++
        b--
    }
    return count
}
