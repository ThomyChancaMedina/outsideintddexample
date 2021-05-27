package com.example.outsideintddexample

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow

class Engine (
    var isTurnedOn: Boolean=false,
    var temperature:Int= 15
        ){


   suspend fun turnOn(): Flow<Int> {
        isTurnedOn=true
        delay(6000)//pasaran 6segundos para ejecutar este hilo
        temperature= 95

        Log.d("COURSE", "turnOn: Engine has turned on")
    }
}