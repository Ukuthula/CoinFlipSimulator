/**
 * Created by Julian on 14.06.2017.
 */

import java.util.*

open class FlipEngine() {
    var headCount = 0
    var numberCount = 0
    val random = Random()
    val first = random.nextInt(2)

    fun spinCoin(): Int {
        var result = random.nextInt(2)

        if(result == 0) {
            headCount++
        }else {
            numberCount++
        }

        return result
    }

    fun getHeadCout(): Int = headCount;
    fun getNumberCout(): Int = numberCount;
}