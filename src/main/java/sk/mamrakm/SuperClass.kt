package sk.mamrakm

open class SuperClass(kokot: String) {
    val kokot: String = kokot
        get() = field

    open fun func() {
        println("SuperClass")
    }
}