package sk.mamrakm

open class SuperClass(strParam: String) {
    val str: String = strParam
        get() = field

    open fun func() {
        println("SuperClass")
    }
}