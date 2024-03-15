package factory

open class Object(var id: Int, var title: String, var price: Int) {
    override fun toString(): String {
        return "[id: $id, title: $title, price: $price, "
    }
}