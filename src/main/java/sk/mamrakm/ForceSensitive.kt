package sk.mamrakm

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import sk.mamrakm.Force

@Component
class ForceSensitive @Autowired constructor(private val forceUser: Force) {
    constructor() : this(Jedi())
    fun doTheThing() {
        forceUser.useTheForce()
    }
}