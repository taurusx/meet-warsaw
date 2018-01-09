package com.example.android.meetwarsaw;

/**
 * {@link Location} represents a location that the user can visit or activity that the user can
 * do while visiting Warsaw.
 * Contains information about Name and Type of activity and optional additional information
 * (its description, address, opening hours, interesting facts).
 */
public class Location {

    /**
     * Constant value that represents no image was provided for this location
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constant values that represents different types of locations
     */
    public static final String TYPE_BUILDING = "Building";
    public static final String TYPE_PLACE = "Interesting Place";
    public static final String TYPE_MUSEUM = "Museum";
    public static final String TYPE_MONUMENT = "Monument or Statue";
    public static final String TYPE_PARK = "Municipal Park";
    public static final String TYPE_FOOD = "Food";
    public static final String TYPE_DRINK = "Drink";
    public static final String TYPE_SPORT = "Sport Spot";
    public static final String TYPE_LEISURE = "Leisure";

    /**
     * String value location or activity name
     */
    private String mName = "";

    /**
     * String value of location or activity type
     */
    private String mType = "";

    /**
     * String value of location or activity address
     */
    private String mAddress = "";

    /**
     * String value of location or activity description (additional information)
     */
    private String mDescription = "";

    /**
     * ID of image in resources to represent the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Location object with initial values of name, type and address.
     *
     * @param name    is the name of location or activity
     * @param type    is the type of location or activity (e.g. museum, kebab bar, sport)
     * @param address is the address of location to visit
     */
    public Location(String name, String type, String address) {
        mName = name;
        mType = type;
        mAddress = "Address: " + address;
    }


    /**
     * Create a new Location object with initial values of name, type and address.
     *
     * @param name        is the name of location or activity
     * @param type        is the type of location or activity (e.g. museum, kebab bar, sport)
     * @param address     is the address of location to visit
     * @param description is the additional information about location such as opening hours,
     *                    interesting fact or general description of place
     */
    public Location(String name, String type, String address, String description) {
        mName = name;
        mType = type;
        mAddress = "Address: " + address;
        mDescription = description;
    }

    /**
     * Create a new Location object with initial values of name, type, address and with image
     * that represents this location.
     *
     * @param name            is the name of location or activity
     * @param type            is the type of location or activity (e.g. museum, kebab bar, sport)
     * @param address         is the address of location to visit
     * @param imageResourceId is the drawable resource ID for the image associated with
     *                        the location
     */
    public Location(String name, String type, String address, int imageResourceId) {
        mName = name;
        mType = type;
        mAddress = "Address: " + address;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Location object with initial values of name, type, address and with image
     * that represents this location.
     *
     * @param name            is the name of location or activity
     * @param type            is the type of location or activity (e.g. museum, kebab bar, sport)
     * @param address         is the address of location to visit
     * @param description     is the additional information about location such as opening hours,
     *                        interesting fact or general description of place
     * @param imageResourceId is the drawable resource ID for the image associated with
     *                        the location
     */
    public Location(String name, String type, String address, String description,
                    int imageResourceId) {
        mName = name;
        mType = type;
        mAddress = "Address: " + address;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string value representing Name of the Location.
     *
     * @return name of location.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the string value representing Type of the Location.
     *
     * @return type of location.
     */
    public String getType() {
        return mType;
    }

    /**
     * Get the string value representing Address of the Location.
     *
     * @return address of location.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the string value of the Location representing Description (additional information).
     *
     * @return description (additional information).
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the int value of ID of image resource that represents the location.
     *
     * @return ID of resource image.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this location.
     *
     * @return boolean information whether image is provided
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Location{" +
                "mName='" + mName + '\'' +
                ", mType='" + mType + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
