package sk.mamrakm

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext


object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val context: ApplicationContext = AnnotationConfigApplicationContext(Config::class.java)
        val forceSensitive: ForceSensitive = context.getBean(ForceSensitive::class.java)
        forceSensitive.doTheThing()
    }
}