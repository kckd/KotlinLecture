class LectureRunner {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println(buildHTMLWithArgs(arrayOf("one string", "two string", "red string", "blue string")))
        }
    }
}
