package com.example.demokmp

/**
 * @author Noellette Jeremie Fabien
 */
interface Platform {
    val name: String
}

expect fun getPlatform(): Platform