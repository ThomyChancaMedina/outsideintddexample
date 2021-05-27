package com.example.outsideintddexample.unittests

import com.example.outsideintddexample.Engine
import junit.framework.Assert.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.test.runBlockingTest

import org.junit.Test

class EngineShould {
  private val engine= Engine()

    @Test
    fun turnOn()= runBlockingTest{
        engine.turnOn()
        assertTrue(engine.isTurnedOn)
    }

    @Test
    fun riseTheTemperatureWhenTurnsOn()= runBlockingTest{
        engine.turnOn()
        assertEquals(95,engine.temperature)
    }

}