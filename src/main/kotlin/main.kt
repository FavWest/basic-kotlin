fun main() {
    //play Pig Dice
    var compScore = 0
    var userScore = 0
    while (compScore < 100 && userScore < 100) {
        compScore += compTurn()
        println("Computer total score: $compScore")
        userScore += userTurn()
        println("User total score: $userScore")
    }
    println("Final Computer Score: $compScore")
    println("Final User Score: $userScore")
    println(declareWinner(userScore, compScore))
}

fun userTurn(): Int{
    var x = 0
    var turnScore = 0
    var roll=0
    var choice = "y"
    while (choice == "y") {
        roll = rollDice()
        println("User: Rolled $roll")
        if (roll == 1) {
            return 0
        } else {
            turnScore += roll
        }
        println("Your turn score is $turnScore. Would you like to roll again?")
        choice = readLine().toString()
        while(choice!="y" && choice!="n"){
            println("Please enter y for yes, n for no")
            choice = readLine().toString()
        }
    }
    return turnScore
}

fun compTurn(): Int {
    var x = 0
    var turnScore = 0
    var roll=0
    while (turnScore < 10) {
        roll = rollDice()
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

fun rollDice(): Int = (Math.random() * 6).toInt() + 1

fun declareWinner(userScore: Int, compScore: Int): String {
    return if(userScore > compScore) "User Wins!" else "Computer Wins!"
}