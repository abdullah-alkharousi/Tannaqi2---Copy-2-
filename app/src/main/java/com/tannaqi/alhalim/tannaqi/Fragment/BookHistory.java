package com.tannaqi.alhalim.tannaqi.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.tannaqi.alhalim.tannaqi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookHistory extends Fragment {

    private static final String TAG_FABRIC = "TAG_FABRIC";


    private TextView bookname;

    public BookHistory() {
        // Required empty public constructor
    }

    public static BookHistory newInstance() {

        Bundle args = new Bundle();

        BookHistory fragment = new BookHistory();
        fragment.setArguments(args);
    
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_book_history, container, false);
        bookname=view.findViewById(R.id.name_book);

        Bundle bn2=getArguments();
        String name=  bn2.getString("First");
    bookname.setText(name);
              
    
        return view;
    }

}
