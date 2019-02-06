package com.tannaqi.alhalim.tannaqi.Fragment;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.tannaqi.alhalim.tannaqi.R;

import java.util.ArrayList;
import java.util.EnumMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class DressInfo extends Fragment {


    private Button book;
    private TextView dressname1;
    private int taskIcon[] = {
            R.drawable.aaaa,
            R.drawable.bbbbb,
            //R.drawable.ccccc
    };

    public DressInfo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dress_info, container, false);
        dressname1 = view.findViewById(R.id.dressname);
        book = view.findViewById(R.id.book_btn);
        ViewPager mViewPager = view.findViewById(R.id.view_pager);
        mViewPager.setAdapter(new MyAdapter());
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String name = dressname1.getText().toString();
                //  Bundle bn = new Bundle();
                //   bn.putString("First", name);
                //    bn.putInt("pic",R.drawable.p);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BookHistory bookh = new BookHistory();
                // bookh.setArguments(bn);
                fragmentTransaction.replace(R.id.container, bookh);
                fragmentTransaction.commit();

            }

        });


        return view;
    }

    public class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return taskIcon.length ;
        }

        @NonNull
        @Override
        //TODO:to set Image(object) view and set in the container
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            ImageView mImageView = new ImageView(getActivity());
            mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.get().load(taskIcon[position]).into(mImageView);
            //         mImageView.setImageResource(R.drawable.a123);
            ((ViewPager) container).addView(mImageView, 0);
            return mImageView;
        }

        @Override
        //TODO:to convert object to image
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == ((ImageView) o);
        }

        //TODO:to Destoy the image from Contaier
        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            ((ViewPager) container).removeView((ImageView) object);
        }
    }
}


