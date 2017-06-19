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
 *  Shows information about building sites of the 8th district.
 */
public class BuildingSitesFragment extends Fragment {

    public BuildingSitesFragment() {
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
        infoItems.add(new InfoItem(R.drawable.building_site_01,
                R.string.string_building_sites_title01,
                R.string.string_building_sites_description01,
                R.string.string_building_sites_address01));
        infoItems.add(new InfoItem(R.drawable.building_site_02,
                R.string.string_building_sites_title02,
                R.string.string_building_sites_description02,
                R.string.string_building_sites_address02));
        infoItems.add(new InfoItem(R.drawable.building_site_03,
                R.string.string_building_sites_title03,
                R.string.string_building_sites_description03,
                R.string.string_building_sites_address03));
        infoItems.add(new InfoItem(R.drawable.building_site_04,
                R.string.string_building_sites_title04,
                R.string.string_building_sites_description04,
                R.string.string_building_sites_address04));
        infoItems.add(new InfoItem(R.drawable.building_site_05,
                R.string.string_building_sites_title05,
                R.string.string_building_sites_description05,
                R.string.string_building_sites_address05));
        infoItems.add(new InfoItem(R.drawable.building_site_06,
                R.string.string_building_sites_title06,
                R.string.string_building_sites_description06,
                R.string.string_building_sites_address06));

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
