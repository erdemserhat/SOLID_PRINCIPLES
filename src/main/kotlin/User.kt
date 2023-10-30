 abstract class User(
    open val name: String,
    open val surname: String,
    open val discountRate: Double = 1.0
):Payable {
     override fun makePayment(amount: Double): Double {
         return discountRate*amount
     }
 }