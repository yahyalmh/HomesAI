package com.yahya.homesai

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform