package com.example.csitgis.lab6;

import android.content.Context;
import android.view.View;

import java.util.List;

public class StudentAdapter extends RecycleView.Adapter<StudentAdapter.MyViewHolder> {
    private Context;
    private List<Student> studentList;

    public class MyViewHolder(
    View view)

    {
        super(view);
        idTextView = view.findViewById(R.id.text_view_id);
        nameText = view.findViewById(R.id.text_view_name);

    }
}
  public StudentAdapter(Context context, List<Student> notesList) {
    this.context =
}
