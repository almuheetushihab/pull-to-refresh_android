package com.example.pulltorefresh.ui.model

data class Channel(
    val handle: String,
    val id: Int,
    val is_active: Boolean,
    val is_default: Boolean,
    val name: String
)