package com.nims.cashbook

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
