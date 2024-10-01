package com.example.myapplication



import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tham chiếu đến các thành phần giao diện nếu cần
        val submitButton: Button = findViewById(R.id.submitButton)

        // Xử lý sự kiện khi nút "Xác nhận" được nhấn
        submitButton.setOnClickListener {
            // Xử lý logic khi người dùng nhấn nút
        }
    }
}