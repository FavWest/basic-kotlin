fun main() {
    //play Pig Dice
    var compScore = 0
    //var userScore = 0
    while (compScore < 100) {
        compScore += compTurn()
        println("Computer total score: $compScore")
    }
    println("Final Score: $compScore")
}

//fun userTurn(){
    //user turn
//}

fun compTurn(): Int {
    var x = 0
    var turnScore = 0
    var roll=0
    while (x < 3) {
        roll = (Math.random() * 6).toInt() + 1
        println("Computer: Rolled $roll")
        if (roll == 1) {
            return 0
        } else {
            turnScore += roll
        }
        x ++
    }
    return turnScore
}