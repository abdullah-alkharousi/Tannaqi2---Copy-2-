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
import android.widget.TextView;

import com.tannaqi.alhalim.tannaqi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dashoard extends Fragment {
    private int taskIcon[] = {
            R.drawable.aaab,
            R.drawable.bbb,
            R.drawable.ccccc,
            R.drawable.dddd
    };

    private String taskName[] = {
            "Dress",
           "Hena",
           "MakeUp",
            "Bouquet"
    };
    private GridView dashboardGV;

    public Dashoard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_dashoard, container, false);
        dashboardGV = view.findViewById(R.id.cust_dashboard);
        dashboardGV.setAdapter(new Myadapter());

        dashboardGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                switch (position) {
                    case 0:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new LocationFragment()).addToBackStack(null).commit();
                        break;
                    case 1:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new Dashoard()).addToBackStack(null).commit();
                        break;
                    case 2:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new Dashoard()).addToBackStack(null).commit();
                        break;
                    case 3:
                  //      getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, Dashoard.newInstance("", "")).addToBackStack(null).commit();
                        break;

                }


            }
        });
        return view;
    }


    public class Myadapter extends BaseAdapter{
        @Override
        public int getCount() {
            return taskIcon.length;
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
            View convertView = inflater.inflate(R.layout.dashboard_customer, null);

            ImageView taskIconIV = convertView.findViewById(R.id.taskIcons_iv);
            TextView taskTagTV = convertView.findViewById(R.id.taskTag_tv);

            taskIconIV.setImageResource(taskIcon[i]);
            taskTagTV.setText(taskName[i]);

            return convertView;
        }
    }
}
