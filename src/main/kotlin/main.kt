fun main() {
    //Find the sum of all multiples of 3 or 5 below 1000
    var sum = 0
    var x =0
    while(x < 1000) {
        if(x % 3 == 0 || x % 5 == 0) sum += x
        x++
    }
    println("The sum of all multiples of 3 or 5 below 1000 is $sum")

    //Find the sum of even-numbered Fibonacci numbers below 100
    sum = 0
    x = 0
    var y = 1
    var next = 0
    while(x < 4_000_000) {
        println(x)
        if(x%2==0) sum += x
        next = x + y
        x = y
        y = next
    }
    println("The sum of even-numbered Fibonacci numbers below 4_000_000 is $sum")
}