package sk.mamrakm

//@Component
class ForceSensitive constructor(private val forceUser1: Force) {
    fun doTheThing() {
        forceUser1.useTheForce()
    }
}