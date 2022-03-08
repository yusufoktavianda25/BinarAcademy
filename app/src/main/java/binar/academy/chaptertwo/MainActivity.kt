package binar.academy.chaptertwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("","")
        Log.i("check","Program has onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.i("check","Program has onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("check","Program has onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("check","Program has onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("check","Program has onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("check","Program has onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("check","Program has onDestroy")
    }
}