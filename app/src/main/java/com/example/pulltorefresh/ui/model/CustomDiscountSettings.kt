package com.example.pulltorefresh.ui.model

data class CustomDiscountSettings(
    val discount_options: List<DiscountOption>,
    val enable_custom_discount: Boolean
)