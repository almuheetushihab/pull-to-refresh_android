package com.example.pulltorefresh.ui.model

data class StoreCreditSettings(
    val channel_ids: List<Int>,
    val conversion: Conversion,
    val convert_store_credit_to_cash: Boolean,
    val enable_mfs_card: Boolean,
    val enable_store_credit: Boolean,
    val store_point: Int
)