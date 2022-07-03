package com.relsellglobal.espressouitestme

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ComputationATest {

    @Mock
    lateinit var operations : Operation
    lateinit var computationA: ComputationA

    @Before
    fun setUp() {
        computationA = ComputationA(operations)
    }

    @Test
    fun givenValidInput_getAddition() {
        val x=5
        val y=10
        computationA.getAddition(x,y)   // whether computationA Object is calling operation method
        verify(operations).add(x,y)


    }
}