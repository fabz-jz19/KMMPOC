package com.example.demokmp

/**
 * @author Noellette Jeremie Fabien
 */
class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello MCB, ${platform.name}!"
    }
}