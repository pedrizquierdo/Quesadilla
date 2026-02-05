package mx.itson.quesadilla

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var numberOne : EditText
    lateinit var numberTwo : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        numberOne = findViewById(R.id.number_one)
        numberTwo = findViewById(R.id.number_two)

        val btnSum = findViewById<View>(R.id.btn_sum) as Button
        btnSum.setOnClickListener(this)

        val btnSubs = findViewById<View>(R.id.btn_subs) as Button
        btnSubs.setOnClickListener(this)

        val btnMult = findViewById<View>(R.id.btn_mult) as Button
        btnMult.setOnClickListener(this)

        val btnDiv = findViewById<View>(R.id.btn_div) as Button
        btnDiv.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_sum ->{
                val value1 = numberOne.text.toString().toFloatOrNull()
                val value2 = numberTwo.text.toString().toFloatOrNull()

                if(value1 == null || value2 == null ){
                    Toast.makeText(
                        this,
                        getString(R.string.enter_numbers_msg),
                        Toast.LENGTH_LONG).show()

                } else {
                    val result = value1 + value2
                    Toast.makeText(
                        this,
                        getString(R.string.sum_total) + result,
                        Toast.LENGTH_LONG).show()

                }

            }

        }

        when(v.id){
            R.id.btn_subs ->{
                val value1 = numberOne.text.toString().toFloatOrNull()
                val value2 = numberTwo.text.toString().toFloatOrNull()

                if(value1 == null || value2 == null ){
                    Toast.makeText(
                        this,
                        getString(R.string.enter_numbers_msg),
                        Toast.LENGTH_LONG).show()

                } else {
                    val result = value1 - value2
                    Toast.makeText(
                        this,
                        getString(R.string.sum_total) + result,
                        Toast.LENGTH_LONG).show()

                }

            }

        }

        when(v.id){
            R.id.btn_mult ->{
                val value1 = numberOne.text.toString().toFloatOrNull()
                val value2 = numberTwo.text.toString().toFloatOrNull()

                if(value1 == null || value2 == null ){
                    Toast.makeText(
                        this,
                        getString(R.string.enter_numbers_msg),
                        Toast.LENGTH_LONG).show()

                } else {
                    val result = value1 * value2
                    Toast.makeText(
                        this,
                        getString(R.string.sum_total) + result,
                        Toast.LENGTH_LONG).show()

                }

            }

        }

        when(v.id){
            R.id.btn_div ->{
                val value1 = numberOne.text.toString().toFloatOrNull()
                val value2 = numberTwo.text.toString().toFloatOrNull()

                if(value1 == null || value2 == null ){
                    Toast.makeText(
                        this,
                        getString(R.string.enter_numbers_msg),
                        Toast.LENGTH_LONG).show()

                } else {
                    val result = value1 / value2
                    Toast.makeText(
                        this,
                        getString(R.string.sum_total) + result,
                        Toast.LENGTH_LONG).show()

                }

            }

        }
    }
}
