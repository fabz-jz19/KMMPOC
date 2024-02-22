package com.example.demokmp

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion + "From IOS main"
}

actual fun getPlatform(): Platform = IOSPlatform()