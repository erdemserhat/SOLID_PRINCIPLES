data class Student(
    override val name: String,
    override val surname: String,
    override val discountRate: Double = 0.80
) : User(name, surname) {



}