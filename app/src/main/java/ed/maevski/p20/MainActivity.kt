package ed.maevski.p20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonKosmos = findViewById<Button>(R.id.buttonKosmos)

        buttonKosmos.setOnClickListener {
            Toast.makeText(this, "Я буду android-разработчиком!", Toast.LENGTH_SHORT).show()
        }
    }
}