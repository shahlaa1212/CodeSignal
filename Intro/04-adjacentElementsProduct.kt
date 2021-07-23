fun adjacentElementsProduct(inputArray: MutableList<Int>): Int=(0..inputArray.size-2).map{
    inputArray[it]*inputArray[it+1]
}.max()?: Integer.MIN_VALUE