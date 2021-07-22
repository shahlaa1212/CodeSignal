fun lineUp(commands: String): Int {
    var x = 0
    var count = 0
    for (i in 0 until commands.length)
    {
        var currentLetter:Char = commands.get(i)
        if(currentLetter == 'A')
            x += 2;
        else if(currentLetter == 'L')
            x += 1;
        else
            x -= 1;

        count = if(x % 2 == 0) count + 1 else count
    }
    return count
}
