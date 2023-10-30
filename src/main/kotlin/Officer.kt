class Officer(
    override val name:String,
    override val surname:String,
    override val discountRate:Double=0.85
):User(name,surname) {

}