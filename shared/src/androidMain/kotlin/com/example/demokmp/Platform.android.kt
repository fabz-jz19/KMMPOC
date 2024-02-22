package com.example.demokmp


/**
 * @author Noellette Jeremie Fabien
 */
class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}" + "From Android main"
}

actual fun getPlatform(): Platform = AndroidPlatform()