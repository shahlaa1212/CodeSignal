int phoneCall(int min1, int min2_10, int min11, int s) {
    int sec = 0;
    if( s < min1){
        return sec;
    }
    s -= min1;
    sec++;
    if ( s < 9 * min2_10){
        sec +=  s / min2_10;
        return sec;
    }
    s -= 9 * min2_10;
    sec += 9;
    sec += s / min11;
    return sec;
}
