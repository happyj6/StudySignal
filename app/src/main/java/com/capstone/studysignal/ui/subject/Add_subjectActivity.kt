package com.capstone.studysignal.ui.subject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.capstone.studysignal.R
import com.capstone.studysignal.databinding.ActivityAddSubjectBinding
import com.capstone.studysignal.databinding.ActivityMainBinding
import com.capstone.studysignal.divide_add_subject
import com.capstone.studysignal.equal_add_subject
import com.capstone.studysignal.time_add_subject

import android.view.View


class Add_subjectActivity : AppCompatActivity() {
    lateinit var binding : ActivityAddSubjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddSubjectBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fun changeFragment(fragment: Fragment) {
            supportFragmentManager .beginTransaction() .replace(R.id.fragContainer, fragment) .commit() }

        setFrag(0)
        with(binding){
            timeBtn.setOnClickListener{
                setFrag(0)
            }
            equalBtn.setOnClickListener{
                setFrag(1)
            }
            divideBtn.setOnClickListener{
                setFrag(2)
            }
        }


    }
    private fun setFrag(fragNum : Int){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        when (fragNum){
            0-> {
                fragmentTransaction.replace(R.id.fragContainer, time_add_subject()).commit()
            }
            1-> {
                fragmentTransaction.replace(R.id.fragContainer, equal_add_subject()).commit()
            }
            2-> {
                fragmentTransaction.replace(R.id.fragContainer, divide_add_subject()).commit()
            }
        }
    }
}

