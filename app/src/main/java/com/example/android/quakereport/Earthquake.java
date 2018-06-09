package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by sankalp on 5/5/18.
 */

public class Earthquake {
    /**
     * Integer for Storing Magnitude of the EarthQuake
     */
    private String mMagnitude;

    /**
     * String For storing name of the place of EarthQuake
     */
    private String mPlace;
    /**
     * Date of EarthQuake
     */
    private String mDate;

    /**
     * Constructor of the class
     * @param magnitude
     * @param place
     * @param date
     */

    public Earthquake(String magnitude, String place, String date){
        mMagnitude = magnitude;
        mPlace = place;
        mDate  = date;
    }

    /**
     * getter method
     * @return magnitude
     */

    public String  getMagnitude(){
        return mMagnitude;
    }

    /**
     * getter method
     * @return place
     */

    public String getmPlace(){
        return mPlace;
    }

    /**
     * getter method
     * @return date
     */

    public String getDate(){
        return mDate;
    }


}
