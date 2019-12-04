package com.example.customadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PersonAdapter extends ArrayAdapter {

   private List<Person> persons;
  private final LayoutInflater layoutInflater;
    private final int layoutResources;

    public PersonAdapter(@NonNull Context context, int resource, List<Person> persons) {
        super(context, resource);
       this.persons = persons;
        this.layoutInflater = LayoutInflater.from(context);
        this.layoutResources = resource;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null)
            v = layoutInflater.inflate(layoutResources,parent,false);
        TextView nameText = v.findViewById(R.id.name);
        TextView idText = v.findViewById(R.id.id);
        TextView emailText = v.findViewById(R.id.email);

        nameText.setText(persons.get(position).name);
        idText.setText(String.valueOf(persons.get(position).id));
        emailText.setText(persons.get(position).email);
        return v;
    }
}
