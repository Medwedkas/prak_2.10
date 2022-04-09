package ru.samsung.itacademy.mdev.simplecalctemplate


import org.junit.Test
import org.junit.Before
import org.junit.Assert.*

class ExampleUnitTest {
    private var calculator: Calculator? = null

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun addition_add() {
        assertEquals(4, calculator!!.add(2, 2))
        assertEquals(0, calculator!!.add(0, 0))
        assertEquals(1, calculator!!.add(1, 0))
        assertEquals(0, calculator!!.add(-1, 1))
        assertEquals(-2, calculator!!.add(-1, -1))
        assertEquals(0, calculator!!.add(0, 0))
    }

    @Test
    fun addition_subtract() {
        assertEquals(0, calculator!!.subtract(-1, -1))
        assertEquals(-1, calculator!!.subtract(-1, 0))
        assertEquals(2, calculator!!.subtract(1, -1))
    }

    @Test
    fun addition_multiplication() {
        assertEquals(0, calculator!!.multiply(1, 0))
        assertEquals(10, calculator!!.multiply(5, 2))
        assertEquals(-10, calculator!!.multiply(-5, 2))
        assertEquals(10, calculator!!.multiply(-5, -2))
    }

    @Test
    fun addition_division() {
        assertEquals(1, calculator!!.divide(12, 12))
        assertEquals(-1, calculator!!.divide(-12, 12))
        assertEquals(-1, calculator!!.divide(12, -12))
        assertEquals(0, calculator!!.divide(0, -12))
        assertEquals(0, calculator!!.divide(1, 0))
    }

    @Test
    fun addition_mix() {
        assertEquals(4, calculator!!.add(2, 2))
        assertEquals(0, calculator!!.subtract(-1, -1))
        assertEquals(10, calculator!!.multiply(5, 2))
        assertEquals(0, calculator!!.divide(0, -12))
    }

}