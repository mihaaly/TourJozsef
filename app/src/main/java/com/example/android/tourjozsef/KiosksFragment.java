package com.example.android.tourjozsef;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Shows information about shops in the 8th district.
 */
public class KiosksFragment extends Fragment {

    public KiosksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflates container.xml which has one ListView
        View rootView = inflater.inflate(R.layout.container, container, false);

        // ArrayList of InfoItem objects
        ArrayList<InfoItem> infoItems = new ArrayList<>();
        // add InfoItem objects to the infoItem ArrayList
        // contains building site information
        infoItems.add(new InfoItem(R.drawable.shop01,
                R.string.string_shops_title01,
                R.string.string_shops_description01,
                R.string.string_shops_address01));
        infoItems.add(new InfoItem(R.drawable.shop02,
                R.string.string_shops_title02,
                R.string.string_shops_description02,
                R.string.string_shops_address02));
        infoItems.add(new InfoItem(R.drawable.shop03,
                R.string.string_shops_title03,
                R.string.string_shops_description03,
                R.string.string_shops_address03));
        infoItems.add(new InfoItem(R.drawable.shop04,
                R.string.string_shops_title04,
                R.string.string_shops_description04,
                R.string.string_shops_address04));
        infoItems.add(new InfoItem(R.drawable.shop05,
                R.string.string_shops_title05,
                R.string.string_shops_description05,
                R.string.string_shops_address05));
        infoItems.add(new InfoItem(R.drawable.shop06,
                R.string.string_shops_title06,
                R.string.string_shops_description06,
                R.string.string_shops_address06));
        infoItems.add(new InfoItem(R.drawable.shop07,
                R.string.string_shops_title07,
                R.string.string_shops_description07,
                R.string.string_shops_address07));
        infoItems.add(new InfoItem(R.drawable.shop08,
                R.string.string_shops_title08,
                R.string.string_shops_description08,
                R.string.string_shops_address08));
        infoItems.add(new InfoItem(R.drawable.shop09,
                R.string.string_shops_title09,
                R.string.string_shops_description09,
                R.string.string_shops_address09));
        infoItems.add(new InfoItem(R.drawable.shop10,
                R.string.string_shops_title10,
                R.string.string_shops_description10,
                R.string.string_shops_address10));

        // creates a custom ArrayAdapter (InfoItemsAdapter.java) instance
        // and sets its data source as: ArrayList infoItems
        InfoItemsAdapter infoItemsAdapter = new InfoItemsAdapter(getActivity(), infoItems);

        // finds the ListView in the fragments layout
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // makes the listView use the custom ArrayAdapter (InfoItemsAdapter.java) instance
        // created above (infoItemsAdapter)
        listView.setAdapter(infoItemsAdapter);

        return rootView;
    }
}
