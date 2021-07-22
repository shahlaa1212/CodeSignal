fun createArray(size: Int): MutableList<Int> {
    var myList = mutableListOf<Int>()
    for (i in 1..size)
        myList.add(1)
    return myList
}