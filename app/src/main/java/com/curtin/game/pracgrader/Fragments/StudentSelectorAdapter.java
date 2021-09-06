package com.curtin.game.pracgrader.Fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.curtin.game.pracgrader.R;
import com.curtin.game.pracgrader.model.Student;

import java.util.ArrayList;

public class StudentSelectorAdapter extends RecyclerView.Adapter<StudentSelectorAdapter.StudentViewHolder> {

    private ArrayList<Student> studentsList;



    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return studentsList.size() - 1;
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder {
        Student student;
        public StudentViewHolder(LayoutInflater li, ViewGroup parent) {
            super(li.inflate(R.layout.student_list_entry, parent, false));
        }

        public void bind(Student student) {
            this.student = student;
        }
    }
}
