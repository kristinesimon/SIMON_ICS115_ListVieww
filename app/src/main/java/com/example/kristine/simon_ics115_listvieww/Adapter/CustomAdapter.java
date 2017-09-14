package com.example.kristine.simon_ics115_listvieww.Adapter;

/**
 * Created by Kristine on 9/13/2017.
 */
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.kristine.simon_ics115_listvieww.Model.College;
import com.example.kristine.simon_ics115_listvieww.R;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private List<College> colleges;
    Context myContext;
    ImageView image;
    TextView college_Name;
    TextView college_Year;

    public int getCount() {
        return colleges.size();
    }

    public Object getItem(int i) {
        return colleges.get(i);
    }

    public long getItemId(int i) {
        return i;
    }


    public CustomAdapter(Context myContext, List<College> colleges) {
        this.myContext = myContext;
        this.colleges = colleges;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View newview = View.inflate(myContext, R.layout.new_layout, null);
        image =  newview.findViewById(R.id.logo);
        college_Name = newview.findViewById(R.id.College);
        college_Year = newview.findViewById(R.id.Year);


        college_Name.setText(colleges.get(i).getCollege());
        college_Year.setText(colleges.get(i).getYear());
        image.setImageResource(colleges.get(i).getLogo());

        return newview;

    }

}
