fun main(args: Array<String>) {
    // println(getFortuneCookie())

    // tenTimes()

    var fortune: String
    // for (i in 1..10) {
        fortune = getFortuneCookie(24)
        println("\nYour fortune is: $fortune\n")
        // if (fortune.contains("Take it easy")) break;
    // }
}

fun getFortuneCookie(birthday: Int) : String {
    val fortunes = listOf(
            "You will have a great day",
            "Things go well for you today",
            "Enjoy a wonderful day of success",
            "Be humble and will turn out well",
            "Today is a good day for exercising restraint",
            "Take it easy and enjoy life",
            "Treasure your friends because they are the greatest fortune"
    )

    // return fortunes[getBirthday().rem(fortunes.size)]

    val index = when(birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }

    return fortunes[index]
}

fun tenTimes() {
    for (i in 0..9) {
        println(getFortuneCookie(i))
    }
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}