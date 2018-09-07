val vowels = setOf('a','e','i','o','u')

fun String.disemvowel(): String {
    return filter { ch -> ch !in vowels}
}

data class Student(val id: Int, val name: String, var nickName: String?, var bribeAmount: Number?) {
    fun printName() {

        println("${aStudent.nickName}")
    }

    fun makeNicknameUppercase() {
        nickName = nickName?.toUpperCase()
    }

    fun makeNicknameLowercase() {
        val oldNick = nickName
        if (oldNick != null) {
            nickName = oldNick.toLowerCase()

        }
    }
}

val aStudent = Student(1, "Robert", null, 50.99)






