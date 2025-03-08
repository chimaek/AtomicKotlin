// IfExpressions/Task1.kt
package ifExpressionsExercise1

import whenexpressions.numbers

fun checkSign(number: Int): String {
    return if (number == 0) {
        "zero"
    } else if (number >= 1) {
        "positive"
    } else {
        "negative"
    }
}

fun main() {
    println(checkSign(-19))  // negative
}