package com.capstone.studysignal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.capstone.studysignal.databinding.ListItemTodoBinding
import com.capstone.studysignal.databinding.ListSubjectBinding
import javax.security.auth.Subject

class SubjectAdapter:RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>() {

    var subjectDataList = mutableListOf<SubjectData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val binding = ListSubjectBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SubjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        holder.bind(subjectDataList[position])
    }

    override fun getItemCount(): Int = subjectDataList.size

    inner class SubjectViewHolder ( private val binding : ListSubjectBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(subjectData:SubjectData) {

        }
    }



}