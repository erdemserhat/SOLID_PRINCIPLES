class Officer(
    override val name:String,
    override val surname:String,
    override val discountRate:Double=0.85
):User(name,surname) {
    override fun makePayment(amount: Double): Double {
        return discountRate*amount
    }
}