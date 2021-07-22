fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    var list = statues.toMutableList()
    var m = list.size
    list.sort()
    var a = list[0]
    var b = list[m - 1]
    return (b - a + 1) - m
}

