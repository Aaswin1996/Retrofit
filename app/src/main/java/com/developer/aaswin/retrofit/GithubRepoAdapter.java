package com.developer.aaswin.retrofit;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aaswin on 13/3/18.
 */
public class GithubRepoAdapter extends ArrayAdapter<GithubRepo> {

    private Context context;
    private List<GithubRepo> values;

    public GithubRepoAdapter(Context context, List<GithubRepo> values) {
        super(context, R.layout.row_listview, values);

        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_listview, parent, false);
        }

        TextView textView = (TextView) row.findViewById(R.id.label);

        GithubRepo item = values.get(position);
        String message = item.getName();
        textView.setText(message);

        return row;
    }
}

