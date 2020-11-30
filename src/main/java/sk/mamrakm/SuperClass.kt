package sk.mamrakm
import io.reactivex.rxjava3.core.*;

open class SuperClass(kokot: String) {
    val kokot: String = kokot
        get() = field

    open fun func() {
        println("SuperClass")
    }
}