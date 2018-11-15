package com.example.android.newsnano;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView title = listItemView.findViewById(R.id.title);
        title.setText((currentNews).getSection());

        TextView section =  listItemView.findViewById(R.id.section);
        section.setText((currentNews).getTitle());

        TextView date = listItemView.findViewById(R.id.date);
        date.setText((currentNews).getDateTime());

        return listItemView;
    }
}