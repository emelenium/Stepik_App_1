package mmm.nnnn

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class SecondActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        findViewById<Button>(R.id.act2_button).setOnClickListener {
            finish()
        }
    }
}