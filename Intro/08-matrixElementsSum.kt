fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var sum :Int=0
    for(i in 0 until matrix[0].size) {
        for(j in 0 until matrix.size) {
            if(matrix[j][i] > 0)sum +=matrix[j][i] else break
        }
    }
    return sum
}
