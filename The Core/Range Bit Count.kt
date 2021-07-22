fun rangeBitCount(a: Int, b: Int): Int {
    var res:Int=0
    for(n in a..b){
        var m = n
        while(m > 0)
        {
            res += m % 2
            m /= 2
        }
    }
    return res
}
