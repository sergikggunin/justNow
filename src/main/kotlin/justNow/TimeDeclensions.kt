package justNow

fun secondsToText(seconds: Int): String {
    return when {
        seconds < 60 -> "только что"
        seconds < 60 * 60 -> minutesDeclension(seconds / 60)
        seconds < 24 * 60 * 60 -> hoursDeclension(seconds / 3600)
        seconds < 48 * 60 * 60 -> "вчера"
        seconds < 72 * 60 * 60 -> "позавчера"
        else -> "давно"
    }
}

fun minutesDeclension(minutes: Int): String {
    val lastDigit = minutes % 10
    val lastTwoDigits = minutes % 100
    return when {
        lastTwoDigits in 11..14 -> "$minutes минут назад"
        lastDigit == 1 -> "$minutes минуту назад"
        lastDigit in 2..4 -> "$minutes минуты назад"
        else -> "$minutes минут назад"
    }
}

fun hoursDeclension(hours: Int): String {
    val lastDigit = hours % 10
    val lastTwoDigits = hours % 100
    return when {
        lastTwoDigits in 11..14 -> "$hours часов назад"
        lastDigit == 1 -> "$hours час назад"
        lastDigit in 2..4 -> "$hours часа назад"
        else -> "$hours часов назад"
    }
}
