fun largestNumber(n: Int) :Int
{
    val base = 10
    val result = Math.pow(base.toDouble(), n.toDouble()).minus(1)
    return result.toInt()
}
