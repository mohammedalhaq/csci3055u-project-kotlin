package mohammedalhaq.github.io.realappkotlin

import android.graphics.Color.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.System.currentTimeMillis
import android.os.CountDownTimer



class MainActivity : AppCompatActivity() {
    var setTime : TextView? = null      //declares views here to be global and used throughout
    var countDown : TextView? = null    //? allows them to set to null and changed later
    var hit : Button? = null
    var timer : Button? = null
    var currentTime : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //sets views
        setTime = findViewById(R.id.lastRun)
        countDown = findViewById(R.id.countDown)
        hit = findViewById(R.id.hit)
        timer = findViewById(R.id.button)

    }

    //this function starts the countdown
    fun getTime(view: View){
        setTime?.setText("0.0")                     //resets the score
        timer?.visibility = View.INVISIBLE          //makes the timer starting button invisible for user ease
        countDown?.setTextColor(RED)                //sets text to red to draw user attention. the ? makes it null safe

        //uses countdowntimer object to count down from 5
        object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                //changes the text value as time progresses
                countDown?.setText((millisUntilFinished / 1000).toString())
            }

            //sets the original button as visible after timer ends
            override fun onFinish() {
                hit?.visibility = View.VISIBLE
                //changes text to TAP so user knows what to do
                countDown?.setText("TAP")
                currentTime = currentTimeMillis() //gets time
            }
        }.start() //starts the timer


    }

    fun settime(view: View){
        //gets time after second button tap
        var elapsed = currentTimeMillis() - currentTime
        currentTime = 0 //resets time

        //Kotlin allows the long to be referenced directly in a string
        var text : String = "$elapsed  ms!"
        setTime?.setText(text)
        setTime?.setTextColor(BLUE)

        //resets everything
        countDown?.setTextColor(BLACK)
        countDown?.setText("5")
        timer?.visibility = View.VISIBLE
        hit?.visibility = View.INVISIBLE
    }

}
