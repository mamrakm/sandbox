package sk.mamrakm

import java.lang.String.valueOf
import java.util.function.Consumer

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val kokotka : List<String> = listOf("A", "B", valueOf(10), valueOf(20), valueOf(30))
        kokotka.forEach(Consumer {t -> println(t.javaClass); })
        Kek<Jedi>().func()
    }
}