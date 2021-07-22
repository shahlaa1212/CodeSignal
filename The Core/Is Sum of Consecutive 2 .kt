fun isSumOfConsecutive2(n: Int): Int {
    var count = 0;
    for(i in 1 until n){
        var sum = i
        var j = 1;
        while(sum < n){
            sum = sum + i + j;
            j++
        }
        if(sum == n)
            count++
    }
    return count
}
