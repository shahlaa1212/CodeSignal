fun replaceMiddle(arr: MutableList<Int>): MutableList<Int> {
    var a = arr.size
    var middle = if(a % 2 != 0) arr[(a) / 2] else
        arr[a / 2] + arr[a/ 2 - 1]
    var b = arr.toMutableList()
    if (a % 2 == 0){
        b.removeAt(a / 2);
        b.add(a / 2, middle)
        b.removeAt(a / 2 - 1)
    }
    return b
}