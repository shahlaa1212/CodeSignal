fun tennisSet(score1: Int, score2: Int) : Boolean{
    return score1 == 6 && score2 < 5 || score2 == 6 && score1 < 5 ||
            score1 == 7 && score2 > 4 && score2 > 4 && score2 < 7 ||
            score2 == 7 && score1 > 4 && score1 < 7
}
