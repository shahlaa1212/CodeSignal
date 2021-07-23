fun increaseNumberRoundness(n: Int):Boolean{
    var n=n
    while (n % 10 == 0){
        n = n / 10;
    }
    while (n % 10 != 0){
        n = n / 10;
    }
    if (n != 0) return true
    return false
}