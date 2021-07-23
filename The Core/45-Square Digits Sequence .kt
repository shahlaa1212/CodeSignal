fun squareDigitsSequence(a0: Int): Int
{
    var numberList =  mutableListOf<Int>()

    var currentValue =a0

    while(!numberList.contains(currentValue)){
        numberList.add(currentValue)

        var nextValue = 0

        while( currentValue > 0) {

            nextValue = nextValue + ((currentValue%10) * (currentValue%10))

            currentValue/= 10
        }
        currentValue = nextValue
    }
    return numberList.size + 1
}