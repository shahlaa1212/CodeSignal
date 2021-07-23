fun isSmooth(arr: MutableList<Int>): Boolean {
    var sizeArray = arr.size
    var  middle:Int
    middle = if(sizeArray % 2 != 0)  arr[(sizeArray - 1) / 2] else
        arr[sizeArray / 2] + arr[sizeArray / 2-1];
    return (arr[0] == middle && middle == arr[sizeArray - 1]);

}