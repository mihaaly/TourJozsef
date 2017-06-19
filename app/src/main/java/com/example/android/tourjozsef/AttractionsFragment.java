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
 * Shows information on Attractions of the 8th district.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
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
        // contains information about attractions in the district
        infoItems.add(new InfoItem(R.drawable.attraction01,
                R.string.string_attractions_title01,
                R.string.string_attractions_description01,
                R.string.string_attractions_address01));
        infoItems.add(new InfoItem(R.drawable.attraction02,
                R.string.string_attractions_title02,
                R.string.string_attractions_description02,
                R.string.string_attractions_address02));
        infoItems.add(new InfoItem(R.drawable.attraction04,
                R.string.string_attractions_title03,
                R.string.string_attractions_description03,
                R.string.string_attractions_address03));
        infoItems.add(new InfoItem(R.drawable.attraction05a,
                R.string.string_attractions_title04,
                R.string.string_attractions_description04,
                R.string.string_attractions_address04));
        infoItems.add(new InfoItem(R.drawable.attraction06,
                R.string.string_attractions_title05,
                R.string.string_attractions_description05,
                R.string.string_attractions_address05));
        infoItems.add(new InfoItem(R.drawable.attraction08,
                R.string.string_attractions_title06,
                R.string.string_attractions_description06,
                R.string.string_attractions_address06));
        infoItems.add(new InfoItem(R.drawable.attraction11,
                R.string.string_attractions_title07,
                R.string.string_attractions_description07,
                R.string.string_attractions_address07));
        infoItems.add(new InfoItem(R.drawable.attraction12,
                R.string.string_attractions_title08,
                R.string.string_attractions_description08,
                R.string.string_attractions_address08));
        infoItems.add(new InfoItem(R.drawable.attraction14,
                R.string.string_attractions_title09,
                R.string.string_attractions_description09,
                R.string.string_attractions_address09));
        infoItems.add(new InfoItem(R.drawable.attraction15,
                R.string.string_attractions_title10,
                R.string.string_attractions_description10,
                R.string.string_attractions_address10));
        infoItems.add(new InfoItem(R.drawable.attraction17,
                R.string.string_attractions_title11,
                R.string.string_attractions_description11,
                R.string.string_attractions_address11));

        // creates a custom ArrayAdapter (InfoItemsAdapter.java) instance
        // and sets its data source as: ArrayList infoItems
        InfoItemsAdapter infoItemsAdapter = new InfoItemsAdapter(getActivity(), infoItems);

        // finds the ListView in the container.xml layout
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // makes the listView use the custom ArrayAdapter (InfoItemsAdapter.java) instance
        // created above (infoItemsAdapter)
        listView.setAdapter(infoItemsAdapter);

        return rootView;
    }
}
