package com.tannaqi.alhalim.tannaqi.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.tannaqi.alhalim.tannaqi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DressAvailable extends Fragment {

    private int taskIcon[] = {
            R.drawable.a123,
            R.drawable.a123,
            R.drawable.a123,
    };

    private String taskName[] = {
            "40.000",
            "35.000",
            "16.000"

    };
    private String price[] = {
            "Select Price",
            "From highest to Lowest",
            "From Lowest to Highest "

    };
    private Spinner priceSp;
    private GridView dressgrid;

    public DressAvailable() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_dress_available, container, false);
        dressgrid = view.findViewById(R.id.dressgrid);
        dressgrid.setAdapter(new MyAdapter());
        dressgrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                switch (position) {
                    case 0:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new DressInfo()).addToBackStack(null).commit();
                        break;
                    case 1:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new Dashoard()).addToBackStack(null).commit();
                        break;
                    case 2:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new Dashoard()).addToBackStack(null).commit();
                        break;


                }
            }
        });
        return view;

    }

public class MyAdapter extends BaseAdapter{
    @Override
    public int getCount() {
        return taskName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View convertView = inflater.inflate(R.layout.dress_availabe_price, null);

        ImageView taskIconIV = convertView.findViewById(R.id.taskIcons_iv);
        TextView taskTagTV = convertView.findViewById(R.id.taskTag_tv);

        taskIconIV.setImageResource(taskIcon[i]);
        taskTagTV.setText(taskName[i]);

        return convertView;
    }
}
}
