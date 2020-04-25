package mmm.nnnn

import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import mmm.nnnn.AT as AT

class MainActivity : AppCompatActivity() {
    lateinit var vText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vText = findViewById<TextView>(R.id.act1_text)
        vText.setTextColor(0xFFFF0000.toInt())
        vText.setOnClickListener {
            Log.e("tag", "Был клик по надписи")
            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("tag1", vText.text)
            startActivityForResult(i, 0)
            val t = object : Thread() {
                override fun run() {
                    //TODO обращение в сеть
                    this@MainActivity.runOnUiThread {

                    }
                }
            }
            t.start()
            AT(this).execute()
        }
        Log.v("tag", "Был запущен OnCreate")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            val str = data.getStringExtra("tag2")
            vText.text = str
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
class AT(val act:MainActivity):AsyncTask<String,Int,String>(){
    override fun doInBackground(vararg params: String?): String {
        TODO("Not yet implemented")
        return ""
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
    }
}
