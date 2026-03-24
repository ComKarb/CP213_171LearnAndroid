package com.example.a171lablearnandroid

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SensorViewModel(application: Application) : AndroidViewModel(application) {
    private val sensorTracker = SensorTracker(application)

    private val _sensorData = MutableStateFlow(floatArrayOf(0f, 0f, 0f))
    val sensorData: StateFlow<FloatArray> = _sensorData.asStateFlow()

    fun startTracking() {
        sensorTracker.startListening { newValues ->
            _sensorData.value = newValues
        }
    }

    fun stopTracking() {
        sensorTracker.stopListening()
    }
}
