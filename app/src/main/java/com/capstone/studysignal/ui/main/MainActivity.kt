package com.capstone.studysignal.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.capstone.studysignal.R
import com.capstone.studysignal.databinding.ActivityMainBinding
import com.capstone.studysignal.ui.calendar.Calendar
import com.capstone.studysignal.ui.setting.Setting
import com.capstone.studysignal.ui.statistics.Statistics
import com.capstone.studysignal.ui.study.Study
import com.capstone.studysignal.ui.todo.Todo
import java.util.*

// 생명주기 = lifeCycle
class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding


    enum class MENU(val value: Int) {
        TODO(0),
        CALENDER(1),
        STATISTICS(2),
        STUDY(3),
        SETTING(4)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun changeFragment(fragment: Fragment) {
            supportFragmentManager .beginTransaction() .replace(R.id.fragContainer, fragment) .commit() }







//        binding.bvMain.isEnabled = false
        binding.bvMain.setOnItemSelectedListener { position ->
            Log.d("happy","position : $position")
            if(position == MENU.TODO.value) {
                Log.d("happy","create todo fragment ")
                setFrag(0)
            } else if(position == MENU.CALENDER.value) {
                Log.d("happy","create calendar fragment ")
                setFrag(1)
            } else if(position == MENU.STATISTICS.value) {
                Log.d("happy","create statistics fragment ")
                setFrag(2)
            } else if(position == MENU.STUDY.value) {
                Log.d("happy","create study fragment ")
                setFrag(3)
            } else if(position == MENU.SETTING.value) {
                Log.d("happy","create setting fragment ")
                setFrag(4)
            }
        }


        val startTime = System.currentTimeMillis()
        val endTime = System.currentTimeMillis()
    }
    private fun setFrag(fragNum : Int){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        when (fragNum){
            0-> {
                fragmentTransaction.replace(R.id.fragContainer, Todo()).commit()
            }
            1-> {
                fragmentTransaction.replace(R.id.fragContainer, Calendar()).commit()
            }
            2-> {
                fragmentTransaction.replace(R.id.fragContainer, Statistics()).commit()
            }
            3-> {
                fragmentTransaction.replace(R.id.fragContainer, Study()).commit()
            }
            4-> {
                fragmentTransaction.replace(R.id.fragContainer, Setting()).commit()
            }
        }
    }


}

