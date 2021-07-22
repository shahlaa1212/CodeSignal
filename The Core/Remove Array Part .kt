fun removeArrayPart(inputArray: MutableList<Int>, l: Int, r: Int): MutableList<Int> {
    var result = mutableListOf<Int>()
    for (i in 0..inputArray.size-1){
        if (l <= i && i <= r) { }
        else result.add(inputArray[i])
    }
    return result
}
