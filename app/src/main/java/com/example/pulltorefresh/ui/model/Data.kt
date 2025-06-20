package com.example.pulltorefresh.ui.model

data class Data(
    val channels: List<Channel>,
    val custom_discount_settings: CustomDiscountSettings,
    val gift_voucher_settings: GiftVoucherSettings,
    val loyalty_program_settings: LoyaltyProgramSettings,
    val store_credit_settings: StoreCreditSettings
)