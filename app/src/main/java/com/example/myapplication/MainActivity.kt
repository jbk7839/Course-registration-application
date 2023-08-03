package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerButton = findViewById<TextView>(R.id.registerButten)
        registerButton.setOnClickListener {
            // 버튼을 클릭했을 때 실행될 코드를 여기에 작성합니다.
            // 예를 들어, 다음 액티비티로 이동하거나 다른 작업을 수행할 수 있습니다.
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


    }
}