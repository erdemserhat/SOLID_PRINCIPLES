
fun main(args:Array<String>){
    var student = Student("Serhat", "ERDEM")
    val retired = Retired("Ahmet","Erdoğan")

    //Edit
    val officer = Officer("Muhammet","Baykara")

    val paymentProcessor=PaymentProcessor()

    paymentProcessor.processPayment(student,100.0)
    paymentProcessor.processPayment(retired,100.0)
    paymentProcessor.processPayment(officer,100.0)




}