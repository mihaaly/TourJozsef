package com.example.android.tourjozsef;

import android.content.Context;

/**
 * Custom class {@InfoItem} contains information on a place of interest (like address, image etc.)
 */
public class InfoItem {

    // integer value containing an image resource ID
    private int mImageID;

    // int value containing the string resource ID for the name of the place
    private int mPlaceName;

    // int value containing the string resource ID for the description of the place
    private int mDescription;

    // int value containing the string resource ID for the address of the place
    private int mAddress;

    // Context of the app
    private Context mContext;

    /**
     *  Constructs a new InfoItem object with initial values
     *  @param imageID image resource id associated with a place
     *  @param placeName the name of the place
     *  @param description the description of the place
     *  @param address the address of the place
     */
    public InfoItem (int imageID, int placeName, int description, int address) {
        mImageID = imageID;
        mPlaceName = placeName;
        mDescription = description;
        mAddress = address;
    }

    /**
     * returns the image resource ID
     * @return value of mImageID
     */
    public int getImageID(){
        return mImageID;
    }

    /**
     * returns the name of the place
     * @return value of mPlaceName
     */
    public int getPlaceName(){
        return mPlaceName;
    }

    /**
     * returns description of the place
     * @return value of mDescription
     */
    public int getDescription(){
        return mDescription;
    }

    /**
     * returns  address of the place
     * @return value of mAddress
     */

    public int getAddress(){
        return mAddress;
    }
}
