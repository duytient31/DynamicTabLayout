package com.mindnotix.dynamictablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



/**
 * Created by Admin on 02-11-2017.
 */

public class ListFragment extends Fragment {

    static final String ARG_SECTION_NUMBER = "section_number";

    public ListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        TextView textView =  rootView.findViewById(R.id.textview);


        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 1: {
                textView.setText("one");
                break;
            }
            case 2: {
                textView.setText("two");
                break;
            }

            case 3: {
                textView.setText("three");
                break;
            }

        }


        return rootView;
    }


}
