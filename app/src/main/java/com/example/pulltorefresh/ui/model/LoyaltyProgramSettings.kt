package com.example.pulltorefresh.ui.model

data class LoyaltyProgramSettings(
    val channel_ids: List<Int>,
    val enable_expiry_date: Boolean,
    val enable_loyalty_program: Boolean,
    val expired_at: String,
    val points_earn: Int,
    val recurring: Boolean,
    val spend_amount: Int,
    val withdraw_options: WithdrawOptions
)