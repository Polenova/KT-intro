fun main() {
    val amount = 200 // стоимость текущей продажи
    val total = 11_000 // сумма предыдущих продаж
    val fee = calculateFee(amount, total)  // exclusive по умолчанию = false
    println("стандарт $fee")
    val feeExclusive = calculateFee(amount, total, exclusive = true)
    println("эксклюзив $feeExclusive")
}

fun calculateFee(amount: Int, total: Int, exclusive: Boolean = false): Int {

    var percent: Int = when {
        total > 50000 -> 15
        total > 10000 -> 20
        total >  1000 -> 25
        else -> 30
    }

    when {
        exclusive -> percent-= 5
    }

    return percent * amount/100
}