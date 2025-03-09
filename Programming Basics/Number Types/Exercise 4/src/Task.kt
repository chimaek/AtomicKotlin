// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
    (hours * 60L * 60L + minutes * 60L + seconds) * 1000L

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}