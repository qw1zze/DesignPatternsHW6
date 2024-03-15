package factory

import java.util.TreeMap

class DB {
    var objs = TreeMap<Int, Object>()

    fun add(obj: Object) {
        objs[obj.id] = obj
    }

    fun get(id: Int): Object? {
        return objs[id]
    }

    override fun toString(): String {
        val builder = StringBuilder(objs.size * 7)

        for (obj: Object in objs.values) {
            builder.appendLine(obj.toString())
        }

        return builder.toString()
    }
}