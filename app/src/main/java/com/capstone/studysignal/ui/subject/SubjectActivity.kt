package com.capstone.studysignal.ui.subject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.capstone.studysignal.SubjectAdapter
import com.capstone.studysignal.databinding.ActivitySubjectBinding

class SubjectActivity : AppCompatActivity() {

    lateinit var binding : ActivitySubjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubjectBinding.inflate(layoutInflater)
        setContentView(binding.root)


        
        binding.addIb.setOnClickListener(){
            val intent = Intent(this, Add_subjectActivity::class.java)
            startActivity(intent)
        }

    }
}