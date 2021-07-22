fun isInfiniteProcess(a: Int, b: Int) :Boolean{
    var x:Int = b - a
    if(a == b){
        return false
    }
    if(a%2==0 && b%2 == 0 && x>1){
        return false
    }
    if(a%2==1 && b%2 == 1 && x>1){
        return false
    }
    return true
}
