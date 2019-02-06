package com.tannaqi.alhalim.tannaqi.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.tannaqi.alhalim.tannaqi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocationFragment extends Fragment {

    private String taskName[] = {
            "Bahla",
            "Sohar",
            "Muscat",
            "Bahla",
            "Sohar",
            "Muscat"

    };
    private GridView listloc;

    public LocationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_location, container, false);
         listloc=view.findViewById(R.id.listlocation);
         listloc.setAdapter(new MyAdapter());
        listloc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                switch (position) {
                    case 0:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new DressesFragment()).addToBackStack(null).commit();
                        break;
                    case 1:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new DressesFragment()).addToBackStack(null).commit();
                        break;
                    case 2:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new DressesFragment()).addToBackStack(null).commit();
                        break;
                    case 3:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new DressesFragment()).addToBackStack(null).commit();
                        break;
                    case 4:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new Dashoard()).addToBackStack(null).commit();
                        break;

                    case 5:
                        //      getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, Dashoard.newInstance("", "")).addToBackStack(null).commit();
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
            View convertView = inflater.inflate(R.layout.location_place, null);


            TextView locationcity = convertView.findViewById(R.id.citybtn);

            locationcity.setText(taskName[i]);

            return convertView;
        }
    }

}
