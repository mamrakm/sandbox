package sk.mamrakm

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import  com.fasterxml.jackson.databind.ObjectMapper

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val context: ApplicationContext = AnnotationConfigApplicationContext(Config::class.java)
        val forceSensitive : ForceSensitive = context.getBean(ForceSensitive::class.java)
        forceSensitive.doTheThing()
        val objectMapper : ObjectMapper = ObjectMapper()
        println(objectMapper.writeValue(System.out, ForceUserData("Obi-Wan Kenobi", "Jedi Master", listOf(Padawan("Anakin Skywalker")))))
        val json = "{\"name\":\"Yoda\",\"rank\":\"Jedi Master\",\"padawans\":[\"Obi-Wan Kenobi\"]}"
        val jsonObject = objectMapper.readValue(json, ForceUserData::class.java)
        println(jsonObject.name)
        println(jsonObject.rank)
        jsonObject.padawans.forEach{ println(it) }
    }
}