import java.util.*

fun main(args: Array<String>) {
//    println("Hello World!")
//
//    dayOfWeek()

    // if (args[0].toInt() < 12 ) println("Good morning, Kotlin") else println("Good night, Kotlin")
    // println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")

    feedTheFish()
}

fun shouldChangeWater (
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : Boolean {

    return true
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the fish eat $food")

    if (shouldChangeWater(day)) {
        println("Change the water")
    }
}

fun dayOfWeek() {
    println("What day is today?")
    val dayNo = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    // Based on dayNo print the name day
    println("Today is " + when (dayNo) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Different time and space dimension"
    })
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
    val food = "fasting"
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "redworms"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}