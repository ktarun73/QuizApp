package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private var tvResult: TextView?=null
    private var btnFinish: Button?=null
    private var tvName: TextView?=null
    private var ivResult: ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        tvResult=findViewById(R.id.tv_result)
        btnFinish=findViewById(R.id.btn_finish)
        tvName=findViewById(R.id.tv_name)
        ivResult=findViewById(R.id.iv_res)
        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val result=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        tvResult?.text="Your result is $result out of $totalQuestions"
        tvName?.text=intent.getStringExtra(Constants.USER_NAME)
        
        btnFinish?.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}