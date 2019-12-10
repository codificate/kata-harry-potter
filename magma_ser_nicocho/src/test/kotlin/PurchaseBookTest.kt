package test.kotlin

import main.kotlin.Book
import main.kotlin.Purchase
import main.kotlin.PurchaseTransaction
import main.kotlin.Volume
import org.junit.Assert
import org.junit.Test

class PurchaseBookTest {

    @Test
    fun `check volume was created`() {
        val volume = Volume(1)
        Assert.assertEquals(1, volume.value)
    }

    @Test
    fun `check book was created`() {
        val volume = Volume(1)
        val book = Book(8, volume)
        Assert.assertEquals(8, book.cost)
        Assert.assertEquals(1, book.volume.value)
    }

    @Test
    fun `when one book is buyed doesn't have discount`() {
        val volume = Volume(1)
        val book = Book(8, volume)

        val purchase = Purchase(listOf(book))
        val action = PurchaseTransaction(purchase)

        val invoice = action()

        Assert.assertEquals(0F, invoice.discount)
    }

    @Test
    fun `when 2 books are buyed doesn't have discount`() {
        val volume = Volume(1)
        val book = Book(8, volume)

        val purchase = Purchase(listOf(book, book))
        val action = PurchaseTransaction(purchase)

        val invoice = action()

        Assert.assertEquals(5F, invoice.discount)
    }
}