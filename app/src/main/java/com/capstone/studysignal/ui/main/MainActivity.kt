package com.capstone.studysignal.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.capstone.studysignal.R
import com.capstone.studysignal.databinding.ActivityMainBinding
import com.capstone.studysignal.ui.calendar.CalendarFragment
import com.capstone.studysignal.ui.setting.SettingFragment
import com.capstone.studysignal.ui.statistics.StatisticsFragment
import com.capstone.studysignal.ui.study.StudyFragment
import com.capstone.studysignal.ui.todo.TodoFragment

// 생명주기 = lifeCycle
class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding

    // fragment bottomNavigation 연결을 위한 enum class
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

        // fragment 교한 함수
        fun changeFragment(fragment: Fragment) {
            supportFragmentManager .beginTransaction() .replace(R.id.fragContainer, fragment) .commit() }

//        binding.bvMain.isEnabled = false
        // bvMain(bottomNavigation)과 fragment(todo,calendar,statistics, study, setting) 연결
        setFrag(0)
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
    // fragment 교환 함수
    private fun setFrag(fragNum : Int){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        when (fragNum){
            0-> {
                fragmentTransaction.replace(R.id.fragContainer, TodoFragment()).commit()
            }
            1-> {
                fragmentTransaction.replace(R.id.fragContainer, CalendarFragment()).commit()
            }
            2-> {
                fragmentTransaction.replace(R.id.fragContainer, StatisticsFragment()).commit()
            }
            3-> {
                fragmentTransaction.replace(R.id.fragContainer, StudyFragment()).commit()
            }
            4-> {
                fragmentTransaction.replace(R.id.fragContainer, SettingFragment()).commit()
            }
        }
    }


}

