package com.example.sooksook2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.sooksook2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)

        //변수만들기
        val age = 24

        if(age >= 20) {
            Log.d("성인판별", "성인이 맞습니다.")
        }
        else if(age >= 17) {
            Log.d("성인판별", "고등학생")
        }
        else {
            Log.d("성인판별", "성인이 아닙니다")
        }

        binding.clickBtn.setOnClickListener {
            Log.d("메인화면로그", "클릭용 버튼 눌림")
            Log.e("메인화면로그", "에러관련로그")
        }

        binding.smallBtn.setOnClickListener {
            Toast.makeText(this, "취소 버튼 눌림", Toast.LENGTH_SHORT).show()
        }

    }
}