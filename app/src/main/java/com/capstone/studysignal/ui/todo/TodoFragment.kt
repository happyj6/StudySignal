package com.capstone.studysignal.ui.todo

import android.content.Intent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.capstone.studysignal.databinding.FragmentTodoBinding
import com.capstone.studysignal.ui.subject.SubjectActivity
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import org.threeten.bp.LocalDate
import org.threeten.bp.temporal.ChronoUnit
import java.text.SimpleDateFormat
import java.util.*

class TodoFragment : Fragment() {
    private var todoBinding : FragmentTodoBinding? = null
    private val binding get() = todoBinding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTodoBinding.inflate(inflater, container, false)
        // barTopTodo textView 수정
        binding.barTopTodo.text = "안녕"

        val currentTime = System.currentTimeMillis()
        Date(currentTime)

        //
        binding.subjectIB.setOnClickListener{
            val intent = Intent(context, SubjectActivity::class.java)
            startActivity(intent)
        }
        return binding.root


        //두번째 방법
        //val date = String.format(getString(R.string.time_date), "1", "30")
        //1시간 30분
    }

    fun Date(timestamp: Long) {
        val sdf = SimpleDateFormat("yyyy-mm-dd")
        val date = sdf.format(timestamp)
        println(date)
    }
    override fun onDestroyView() {
        todoBinding = null
        super.onDestroyView()
    }
}

