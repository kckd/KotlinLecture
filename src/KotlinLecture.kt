val vowels = setOf('a','e','i','o','u')

fun String.disemvowel(): String {
    return filter { it !in vowels }
}

// Data classes auto generate equal(), copy(), hashCode(), toString(), getters and setters, and componentN() methods
data class Student(val id: Int, val name: String, var nickName: String? = null, var bribeAmount: Number? = null)
{
    fun printName() {
        // String iterpolation example
        println("${aStudent.nickName}")
    }

    fun makeNicknameUppercase() {
        // ? attempts to unwrap a nullable. If null it returns null.
        nickName = nickName?.toUpperCase()
    }

    fun makeNicknameLowercase() {
        // Example of smart cast from nullable type. Note I had to make a local immutable variable
        val oldNick = nickName
        if (oldNick != null) {
            nickName = oldNick.toLowerCase()

        }
    }
}

val aStudent = Student(1, "Robert", null, 50.99)

// Named parameters allow skipping parameters that you don't need, as long as they have a default value
val st = Student(id=1, name = "fred")






