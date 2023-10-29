data class Retired(
    override val name: String,
    override val surname: String,
    override val discountRate: Double = 0.90
) : User(name, surname) {
    override fun makePayment(amount: Double): Double {
        return amount*discountRate
    }
}