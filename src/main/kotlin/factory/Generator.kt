package factory

class Generator {
    fun getCPU(id: Int, title: String, price: Int, socket: String, cores: Int, rate: Int): CPU {
        return CPU(id, title, price, socket, cores, rate)
    }

    fun getHarddisk(id: Int, title: String, price: Int, capacity: Int, speed: Int): HardDisk {
        return HardDisk(id, title, price, capacity, speed)
    }

    fun getMotherboard(id: Int, title: String, price: Int, socket: Int, number: Int, ram: String): Motherboard {
        return Motherboard(id, title, price, socket, number, ram)
    }
}