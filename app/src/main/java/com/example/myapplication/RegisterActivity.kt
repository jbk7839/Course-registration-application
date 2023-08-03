package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // XML 리소스에서 배열 가져오기
        val data = resources.getStringArray(R.array.Major)

        // 어댑터 생성 (초기화)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, data)

        // 드롭다운 레이아웃 설정
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // 스피너에 어댑터 설정 (초기화)
        val spinner = findViewById<Spinner>(R.id.MajorSpiner)
        spinner.adapter = adapter

    }


}
