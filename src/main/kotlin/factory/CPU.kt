package factory

import java.util.Objects

class CPU(id: Int, title: String, price: Int, var socket: String, var cores: Int, var rate: Int): Object(id, title, price) {
    override fun toString(): String {
        return super.toString() + "type: cpu, socket: $socket, cores: $cores, rate: $rate]"
    }
}