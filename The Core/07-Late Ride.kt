fun lateRide(n: Int): Int {
    val hour = n/60
    val minte = n%60
    return hour/10+hour%10 + minte/10+minte%10
}
