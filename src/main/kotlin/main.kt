fun main() {
    //Find the sum of all multiples of 3 or 5 below 1000
    var sum = 0
    var x =0
    while(x <= 1000) {
        if(x % 3 == 0 || x % 5 == 0) sum += x
        x++
    }
    println(sum)
}