package factory

class HardDisk(id: Int, title: String, price: Int, var capacity: Int, var speed: Int): Object(id, title, price) {
    override fun toString(): String {
        return super.toString() + "type: hard disk, capacity: $capacity, speed: $speed]"
    }
}