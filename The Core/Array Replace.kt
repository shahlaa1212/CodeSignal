fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    for (i in 0..inputArray.size-1){
        if (inputArray[i] == elemToReplace)
            inputArray[i] = substitutionElem
    }
    return inputArray
}