package com.example.ba2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lấy các thành phần từ layout
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val buttonCancel = findViewById<Button>(R.id.buttonCancel)

        // Thiết lập sự kiện cho nút "Lưu"
        buttonSave.setOnClickListener {
            val name = editText.text.toString()
            textView.text = "Tên đã lưu: $name"
        }

        // Thiết lập sự kiện cho nút "Hủy"
        buttonCancel.setOnClickListener {
            editText.text.clear()
            textView.text = "Tên người dùng"
        }

        // Các sự kiện khác cho 3 nút (Nút 1, Nút 2, Nút 3)
        button1.setOnClickListener {
            textView.text = "Bạn đã nhấn Nút 1"
        }

        button2.setOnClickListener {
            textView.text = "Bạn đã nhấn Nút 2"
        }

        button3.setOnClickListener {
            textView.text = "Bạn đã nhấn Nút 3"
        }
    }
}
