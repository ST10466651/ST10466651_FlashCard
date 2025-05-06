package vcmsa.ci.st10466651_flashcard

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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


        knowledge.text = "Welcome to BrainBank - the ultimate flashcard app designed to supercharge your learning! Organize, review and retain information effortlessly. Study smarter, not harder and start building your brainpower today"
    }
}