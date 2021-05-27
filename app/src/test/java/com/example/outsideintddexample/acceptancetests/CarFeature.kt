package com.example.outsideintddexample.acceptancetests

import android.speech.tts.TextToSpeech
import com.example.outsideintddexample.Car
import com.example.outsideintddexample.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.coroutineScope
import org.junit.Rule

import org.junit.Test

class CarFeature {

    private val engine= Engine()
    private val car= Car(engine,6.0,)

    @get:Rule
     var coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun carIsLoosingFuelWhenItTurnsOn(){
        car.turnOn()

        assertEquals(5.5, car.fuel)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature(){
        car.turnOn()

        coroutinesTestRule.advanceTimeBy(6001)

        assertEquals(95,car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)



    }

}