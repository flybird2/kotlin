// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND: JS_IR
fun box() : String {


    fun local(i: Int = 1) : Int {
        return i
    }

    return if (local() != 1) "fail" else "OK"
}

