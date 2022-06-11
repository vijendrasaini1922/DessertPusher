package com.infosys.dessertpusher

import android.os.Handler
import androidx.core.os.postDelayed
import timber.log.Timber

class DesertTimer {
    var secondcounts = 0

    /*
     * [Handler] is a class meant to process a queue of messages (known as [android.os.Message]s)
     * or actions (known as [Runnable]s)
     */
    private var handler = Handler()
    private lateinit var runnable: Runnable

    fun startTimer() {
        runnable = Runnable {
            secondcounts++
            Timber.i("Timer is at : $ secondcounts")
            handler.postDelayed(runnable, 1000)
        }
        // Initialy start the timer
        handler.postDelayed(runnable, 1000)
    }

    fun stopTimer() {
        handler.removeCallbacks(runnable)
    }

}