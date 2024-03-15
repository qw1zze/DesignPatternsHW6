package factory

class Motherboard(id: Int, title: String, price: Int, var socket: Int, var number: Int, var ram: String): Object(id, title, price)  {
    override fun toString(): String {
        return super.toString() + "type: Motherboard, socket: $socket, number of cpu: $number, ram: $ram]"
    }
}