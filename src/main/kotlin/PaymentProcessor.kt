class PaymentProcessor {
    fun processPayment(user:User, amount:Double):Double{
        println("${user.name} paid ${user.makePayment(amount)} with %${100-user.discountRate*100} discount")
        return user.makePayment(amount)
    }
}