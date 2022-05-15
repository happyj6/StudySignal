package com.capstone.studysignal.ui.todo

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.capstone.studysignal.R
import com.capstone.studysignal.databinding.ActivityMainBinding
import java.time.LocalDate
import com.capstone.studysignal.databinding.FragmentTodoBinding
import java.time.format.DateTimeFormatter

class Todo : Fragment() {
    lateinit var binding : FragmentTodoBinding

    @RequiresApi(Build.VERSION_CODES.O)
    var onlyDate : LocalDate = LocalDate.now()
    @RequiresApi(Build.VERSION_CODES.O)
    var StrOnlyDate = onlyDate.format(DateTimeFormatter.ofPattern("yyyy-mm-dd"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentTodoBinding.inflate(inflater, container, false)
        binding.barTopTodo.text = StrOnlyDate
        val view = binding.root
        return view

        binding.subjectIB




        //두번째 방법
        //val date = String.format(getString(R.string.time_date), "1", "30")
        //1시간 30분


    }




}