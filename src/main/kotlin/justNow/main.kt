package justNow

fun main() {
    val secondsArray = intArrayOf(45, 3456, 4000, 86400, 100000, 200000)
    for (seconds in secondsArray) {
        println(secondsToText(seconds))
    }
}
