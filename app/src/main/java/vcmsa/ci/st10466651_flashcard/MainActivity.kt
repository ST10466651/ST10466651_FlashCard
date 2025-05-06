package vcmsa.ci.st10466651_flashcard

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    val questions = arrayOf(
        ""
    )

    val answers = arrayOf(
        ""
    )

    val useranswer = arrayOf(
        "",
        "",
        "",
        "",
        ""
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val knowledge = findViewById<TextView>(R.id.textInfo)
        val start = findViewById<Button>(R.id.btnStart)

        start.setOnClickListener {
            val intent = Intent(this, Quiz::class.java)
        }
    }
}