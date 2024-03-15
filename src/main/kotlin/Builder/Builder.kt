package Builder

interface Builder {
    fun buildTitle(title: String): Builder
    fun buildTask(task: String): Builder
    fun buildAbstract(abstract: String): Builder
    fun buildContent(content: String): Builder
    fun buildBody(body: String): Builder
    fun build(): Report
}