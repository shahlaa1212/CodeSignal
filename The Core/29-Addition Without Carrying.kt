fun additionWithoutCarrying(param1: Int, param2: Int): Int {
    var res = 0;
    var multiplier = 1
    var param1 = param1
    var param2 = param2
    var bit_sum:Int
    while(true)
    {  if(param1==0 && param2==0)
        break;
        bit_sum = (param1 % 10) + (param2 % 10)
        bit_sum %= 10
        res = (bit_sum * multiplier) + res
        param1 /= 10
        param2 /= 10
        multiplier *= 10
    }
    return res.toInt()
}
