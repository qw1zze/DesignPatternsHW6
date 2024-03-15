package Builder
import com.google.gson.Gson

class HomeWorkReport constructor(private val content: Content): Report {

    override fun makeReport(): String {
        val gson = Gson()

        return gson.toJson(content)
    }

    class HomeWorkBuilder: Builder {
        private var title = ""
        private var task = ""
        private var abstract = ""
        private var content = ""
        private var body = ""

        override fun buildTitle(title: String): Builder {
            this.title = title
            return this
        }

        override fun buildTask(task: String): Builder {
            this.task = task
            return this
        }

        override fun buildAbstract(abstract: String): Builder {
            this.abstract = abstract
            return this
        }

        override fun buildContent(content: String): Builder {
            this.content = content
            return this
        }

        override fun buildBody(body: String): Builder {
            this.body = body
            return this
        }

        override fun build(): Report {
            val content = Content(title, task, abstract, content, body)
            return HomeWorkReport(content)
        }
    }
}