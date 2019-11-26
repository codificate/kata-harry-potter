package test.kotlin

import main.kotlin.Book
import main.kotlin.Volume
import org.junit.Assert
import org.junit.Test

class CreateBookTest {

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

}