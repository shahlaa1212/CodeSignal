fun mirrorBits(a: Int): Int {
    var tmp:Int = 0
    var a = a
    while(a != 0){
        tmp = tmp shl(1)
        if(a and 1 == 1)
        {
            tmp++
        }
        a = a shr(1)
    }
    return tmp
}
