/**
 * Created by Julian on 13.06.2017.
 */

fun main(args: Array<String>){
    println("Hello World!")
    var coin = FlipEngine()
    var x = 0
    do {
        var test = coin.spinCoin();
        println("$test"+ coin.getHeadCout() + coin.getNumberCout());
        x++
    }while (x < 20)
}

