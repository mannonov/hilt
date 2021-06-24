package com.example.android.hilt.data

import android.os.Handler
import android.os.Looper
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Data manager class that handles data manipulation between the database and the UI.
 */
@Singleton
class LoggerLocalDataSource @Inject constructor(private val logDao: LogDao):LoggerDataSource {

    private val executorService: ExecutorService = Executors.newFixedThreadPool(4)
    private val mainThreadHandler by lazy {
        Handler(Looper.getMainLooper())
    }

    override fun addLog(msg: String) {
        TODO("Not yet implemented")
    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun removeLogs() {
        TODO("Not yet implemented")
    }


}
