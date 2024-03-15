package Builder

fun main() {
    val homeWorkBuilder = HomeWorkReport.HomeWorkBuilder()

    val homeWork = homeWorkBuilder
        .buildTitle("Домашняя работа")
        .buildTask("Разработка паттернов")
        .buildAbstract("Аннотация")
        .buildBody("Текст")
        .buildContent("Оглавление")
        .build()

    println("Домашняя работа:")
    println(homeWork.makeReport())

    val labWorkBuilder = LabWork.LabWorkBuilder()

    val labWork = labWorkBuilder
        .buildTitle("Лабораторная работа")
        .buildTask("Разработка паттернов")
        .buildAbstract("Аннотация")
        .buildBody("Текст")
        .buildContent("Оглавление")
        .build()

    println("Лабораторная работа:")
    println(labWork.makeReport())
}