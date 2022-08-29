import kotlin.random.Random

fun main() {
    var countedOver = 0
    for (i in 2000 downTo 0){
        val randomNumber = Random.nextInt(20,45)
        if (randomNumber>38)
            countedOver++
    }
println("In 2000 random numbers from 20 through 45, the amount over 38 is: $countedOver")

}