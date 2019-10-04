package com.train

class PostOfficeBoxKt(length: Float, width: Float, height: Int) : BoxBaseKt(length, width, height), BoxValidationInterfaceKt {
    override fun validate(length: Float, width: Float, height: Int) =
        (this.length >= length && this.width >= width && this.height >= height)
}