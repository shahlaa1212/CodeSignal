fun candles(candlesNumber: Int, makeNew: Int): Int {
    var burned = 0
    var candlesNumber = candlesNumber
    var makeNew = makeNew
    var leftowers = 0
    while (candlesNumber > 0) {
        burned += candlesNumber
        leftowers += candlesNumber
        candlesNumber = leftowers / makeNew
        leftowers %= makeNew
    }
    return burned;
}
