// IGNORE_BACKEND: JVM_IR
class My {
    companion object {
        private val my: String = "O"
            get() = { field }() + "K"

        fun getValue() = my
    }
}

fun box() = My.getValue()