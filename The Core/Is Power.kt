fun isPower(n: Int): Boolean {
    if (n == 1) return true
    for(i in 2..20)
    {
        var b = i *i
        while(b <= n)
        {
            if(b == n)
            {
                return true
            }
            b *= i
        }
    }
    return false
}
