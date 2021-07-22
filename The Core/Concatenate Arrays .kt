fun concatenateArrays(a: MutableList<Int>, b: MutableList<Int>): MutableList<Int> {
    var result = mutableListOf<Int>()
    for (i in 0..a.size-1){
        result.add(a[i])
    }
    for (i in 0..b.size-1){
        result.add(b[i])
    }
    var c = result.toIntArray()
    return c.toMutableList()
}

