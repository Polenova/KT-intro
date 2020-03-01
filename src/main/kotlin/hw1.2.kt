fun main() {
    val index = bodyMassIndex(1.53,56)
    val verdict = when {
        index < 16.0 -> "Выраженный дефицит массы тела"
        index >= 16.0 && index < 18.5 -> "Недостаточная (дефицит) масса тела"
        index >= 18.5 && index < 25 -> "Норма"
        index >= 25 && index < 30 -> "избыточная масса тела (предожирение)"
        index >= 30 && index < 35 -> "Ожирение"
        index >= 35 && index < 40 -> "Ожирение резкое"
        else -> "Очень резкое ожирение "
    }
    println(verdict)
}

fun bodyMassIndex(height: Double, weight: Int): Double {
    return weight / (height * height)
}