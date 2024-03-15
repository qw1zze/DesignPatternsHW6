package factory

fun FillDB(db: DB) {
    val generator = Generator()
    for (i in 1..10) {
        db.add(generator.getCPU(i, "Процессор $i", i * 100, "Socket", 4, 3))
        db.add(generator.getMotherboard(i + 10, "Материнская плата $i", i * 1000, 2, 2, "RAM"))
        db.add(generator.getHarddisk(i + 20, "Жесткий диск $i", i * 150, 1000, 7200))
    }
}

fun cmdLine(input: String?): Int? {

    return try {
        input?.toInt()
    } catch (exp: Exception) {
        return null
    }
}

fun main() {
    val db = DB()
    FillDB(db)
    println(db.toString())

    print("Введите id продукта: ")
    val id = readlnOrNull()

    try {
        val intId = id?.toInt()!!

        println(db.get(intId)?.toString())
    } catch (exp: Exception) {
        println("Error")
    }
}