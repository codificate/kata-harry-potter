package main.kotlin

class PurchaseTransaction(private val purchase: Purchase) {
    operator fun invoke(): Invoice {
        val discount = calculateDiscount()
        return Invoice(8F, 0F)
    }

    private fun calculateDiscount(): Float {
        purchase.basket.filter { book -> book.volume.value % 2L == 0 }
    }
}
