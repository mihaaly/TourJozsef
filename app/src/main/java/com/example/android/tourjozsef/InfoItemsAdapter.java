package com.example.android.tourjozsef;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Custom ArrayAdapter for an ArrayList of InfoItem.class objects, that uses a custom layout for
 * items (list_item.xml)
 */
public class InfoItemsAdapter extends ArrayAdapter<InfoItem> {

    /**
     * Constructor
     * @param context
     * @param infoItems list of InfoItem.java objects to be displayed
     */
    public InfoItemsAdapter(Activity context, ArrayList<InfoItem> infoItems){
        super (context, 0, infoItems);
    }

    /**
     * Assigns a custom layout (list_item.xml) to the ListView (id: listView_items) found in
     * content_main.xml
     *
     * @param position the position of an element in the the ArrayList<InfoItem>
     * @param convertView the custom layout used for recycling (list_item.xml)
     * @param parent
     * @return a View corresponding to the ArrayList position
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // pass in the custom layout for a list item
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        // getItem() method from the ArrayAdapter super class, gets index of the current
        // InfoItem.java class object
        InfoItem currentInfoItem = getItem(position);

        // find View in listItemView (list_item.xml) that contains the image of the place
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        // get image resource id of the currentInfoItem object and set it as
        // image resource for the imageView
        imageView.setImageResource(currentInfoItem.getImageID()); // getImageID() declared in InfoItem.java

        // find View in listItemView (list_item.xml) that contains the name of the place
        TextView nameView = (TextView) listItemView.findViewById(R.id.nameView);
        // get String containing the name of the place (from the currentInfoItem object) and
        // set it as the text for the nameView
        nameView.setText(currentInfoItem.getPlaceName()); // getPlaceName() declared in InfoItem.java

        // find View in listItemView (list_item.xml) that contains the de of the place
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.descriptionView);
        // get String containing the name of the place (from the currentInfoItem object) and
        // set it as the text for the nameView
        descriptionView.setText(currentInfoItem.getDescription()); // getDescription() declared in InfoItem.java

        // find View in listItemView (list_item.xml) that contains the address of the place
        TextView addressView = (TextView) listItemView.findViewById(R.id.addressView);
        // get String containing the name of the place (from the currentInfoItem object) and
        // set it as the text for the nameView
        addressView.setText(currentInfoItem.getAddress()); // getAddress() declared in InfoItem.java

        return listItemView;
    }
}
