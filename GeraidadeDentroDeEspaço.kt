const val MIN_AGE = 12
const val MAX_AGE = 34

fun main() {
    var age = (10..100).random()
    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE)
    println(age <= MAX_AGE)
    
}