fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    var num=statues.size
    statues.sort()
    var small:Int=statues[0]
    var big=statues[num-1]
    return big-small-num+1
}
