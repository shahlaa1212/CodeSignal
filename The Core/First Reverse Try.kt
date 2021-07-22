fun firstReverseTry(arr: MutableList<Int>): MutableList<Int> {
    if (arr.size == 0) return arr;
    var index = arr[0];
    arr[0] = arr[arr.size- 1]
    arr[arr.size - 1] = index
    return arr
}
