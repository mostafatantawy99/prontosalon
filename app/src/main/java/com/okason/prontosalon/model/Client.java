package com.okason.prontosalon.model;

import java.util.Calendar;
import java.util.UUID;

/**
 * Created by Valentine on 1/22/2016.
 */
public class Client {
    // Client ID.
    private UUID mId;

    // Client information.
    private String mImagePath;
    private String mName;
    private Calendar mBirthDate;
    private String mReferredBy;
    private String mPhone;
    private String mEmail;
    private String mStreet;
    private String mCity;
    private String mState;
    private String mZipCode;
    private Calendar mNextAppointmentDate;
    private Calendar mLastAppointmentDate;
    private String mPreferredAppointmentDay;
    private Calendar mPreferredAppointmentTime;
    private String mStyleDescription;
    private String mHairPorosity;
    private String mHairTexture;
    private String mHairComments;
    private String mCutLikes;
    private String mCutDislikes;
    private String mColorTreatment;
    private String mColorFormula;
    private String mComments;


    /**
     * Create a generic client with default data.
     *
     * @param id Id for this client.
     */
    public Client(UUID id) {

        // Set client ID.
        mId = id;

        // Initialize client information.
        mImagePath = "";
        mName = "";
        mBirthDate = null;
        mReferredBy = "";
        mNextAppointmentDate = null;
        mLastAppointmentDate = null;
        mPreferredAppointmentDay = "";
        mPreferredAppointmentTime = null;
        mPhone = "";
        mEmail = "";
        mStreet = "";
        mCity = "";
        mState = "";
        mZipCode = "";
        mStyleDescription = "";
        mHairPorosity = "";
        mHairTexture = "";
        mHairComments = "";
        mCutLikes = "";
        mCutDislikes = "";
        mColorTreatment = "";
        mColorFormula = "";
        mComments = "";
    }

    /**
     * Create a client from the specified data.
     * @param id Id for this client.
     * @param imagePath Name of the picture stored for this client.
     * @param name Client's name.
     * @param birthDate Client's birth date.
     * @param referredBy Client's referee.
     * @param phone Client's phone number.
     * @param email Client's email address.
     * @param street Client's street address.
     * @param city Client's home city.
     * @param state Client's home state.
     * @param zipCode Client's home zip code.
     * @param nextAppointmentDate Client's next appointment date.
     * @param lastAppointmentDate Client's last appointment date.
     * @param preferredAppointmentDay Client's preferred appointment day of the week.
     * @param preferredAppointmentTime Client's preferred appointment time.
     * @param styleDescription Client's style description.
     * @param hairPorosity Client's hair porosity.
     * @param hairTexture Client's hair texture.
     * @param hairComments Client's hair condition.
     * @param cutLikes Client's cut likes.
     * @param cutDislikes Client's cut dislikes.
     * @param colorTreatment Client's color treatment.
     * @param colorFormula Client's color formula.
     * @param comments Additional comments about client.
     */
    public Client(UUID id, String imagePath, String name,
                  Calendar birthDate, String referredBy, String phone, String email,
                  String street, String city, String state, String zipCode,
                  Calendar nextAppointmentDate, Calendar lastAppointmentDate,
                  String preferredAppointmentDay, Calendar preferredAppointmentTime,
                  String styleDescription, String hairPorosity, String hairTexture,
                  String hairComments, String cutLikes, String cutDislikes, String colorTreatment,
                  String colorFormula, String comments) {

        // Set client ID.
        mId = id;

        // Set client information.
        mImagePath = imagePath;
        mName = name;
        mBirthDate = birthDate;
        mReferredBy = referredBy;
        mNextAppointmentDate = nextAppointmentDate;
        mLastAppointmentDate = lastAppointmentDate;
        mPreferredAppointmentDay = preferredAppointmentDay;
        mPreferredAppointmentTime = preferredAppointmentTime;
        mPhone = phone;
        mEmail = email;
        mStreet = street;
        mCity = city;
        mState = state;
        mZipCode = zipCode;
        mStyleDescription = styleDescription;
        mHairPorosity = hairPorosity;
        mHairTexture = hairTexture;
        mHairComments = hairComments;
        mCutLikes = cutLikes;
        mCutDislikes = cutDislikes;
        mColorTreatment = colorTreatment;
        mColorFormula = colorFormula;
        mComments = comments;
    }

    /**
     * Create a client from the specified data.
     * @param id Id for this client.
     * @param imagePath Path to the picture stored for this client.
     * @param name Client's name.
     * @param birthDate Client's birth date in milliseconds.
     * @param referredBy Client's referee.
     * @param phone Client's phone number.
     * @param email Client's email address.
     * @param street Client's street address.
     * @param city Client's home city.
     * @param state Client's home state.
     * @param zipCode Client's home zip code.
     * @param nextAppointmentDate Client's next appointment date in milliseconds.
     * @param lastAppointmentDate Client's last appointment date in milliseconds.
     * @param preferredAppointmentDay Client's preferred appointment day of the week.
     * @param preferredAppointmentTime Client's preferred appointment time in milliseconds.
     * @param styleDescription Client's style description.
     * @param hairPorosity Client's hair porosity.
     * @param hairTexture Client's hair texture.
     * @param hairComments Client's hair condition.
     * @param cutLikes Client's cut likes.
     * @param cutDislikes Client's cut dislikes.
     * @param colorTreatment Client's color treatment.
     * @param colorFormula Client's color formula.
     * @param comments Additional comments about client.
     */
    public Client(String id, String imagePath, String name,
                  long birthDate, String referredBy, String phone, String email,
                  String street, String city, String state, String zipCode,
                  long nextAppointmentDate, long lastAppointmentDate,
                  String preferredAppointmentDay, long preferredAppointmentTime,
                  String styleDescription, String hairPorosity, String hairTexture,
                  String hairComments, String cutLikes, String cutDislikes, String colorTreatment,
                  String colorFormula, String comments) {

        // Set client ID.
        mId = UUID.fromString(id);

        // Set client information, ensuring dates are valid.
        mImagePath = imagePath;
        mName = name;
        if (birthDate > 0) {
            mBirthDate = Calendar.getInstance();
            mBirthDate.setTimeInMillis(birthDate);
        }
        mReferredBy = referredBy;
        if (nextAppointmentDate > 0) {
            mNextAppointmentDate = Calendar.getInstance();
            mNextAppointmentDate.setTimeInMillis(nextAppointmentDate);
        }
        if (lastAppointmentDate > 0) {
            mLastAppointmentDate = Calendar.getInstance();
            mLastAppointmentDate.setTimeInMillis(lastAppointmentDate);
        }
        mPreferredAppointmentDay = preferredAppointmentDay;
        if (preferredAppointmentTime > 0) {
            mPreferredAppointmentTime = Calendar.getInstance();
            mPreferredAppointmentTime.setTimeInMillis(preferredAppointmentTime);
        }
        mPhone = phone;
        mEmail = email;
        mStreet = street;
        mCity = city;
        mState = state;
        mZipCode = zipCode;
        mStyleDescription = styleDescription;
        mHairPorosity = hairPorosity;
        mHairTexture = hairTexture;
        mHairComments = hairComments;
        mCutLikes = cutLikes;
        mCutDislikes = cutDislikes;
        mColorTreatment = colorTreatment;
        mColorFormula = colorFormula;
        mComments = comments;
    }

    /**
     * Update client information.
     *
     * @param client Updated client.
     */
    public void update(Client client) {

        // Set client information.
        mImagePath = client.getImagePath();
        mName = client.getName();
        mBirthDate = client.getBirthDate();
        mReferredBy = client.getReferredBy();
        mNextAppointmentDate = client.getNextAppointmentDate();
        mLastAppointmentDate = client.getLastAppointmentDate();
        mPreferredAppointmentDay = client.getPreferredAppointmentDay();
        mPreferredAppointmentTime = client.getPreferredAppointmentTime();
        mPhone = client.getPhone();
        mEmail = client.getEmail();
        mStreet = client.getStreet();
        mCity = client.getCity();
        mState = client.getState();
        mZipCode = client.getZipCode();
        mStyleDescription = client.getStyleDescription();
        mHairPorosity = client.getHairPorosity();
        mHairTexture = client.getHairTexture();
        mHairComments = client.getHairComments();
        mCutLikes = client.getCutLikes();
        mCutDislikes = client.getCutDislikes();
        mColorTreatment = client.getColorTreatment();
        mColorFormula = client.getColorFormula();
        mComments = client.getComments();
    }


    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getImagePath() {
        return mImagePath;
    }

    public void setImagePath(String imagePath) {
        mImagePath = imagePath;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Calendar getBirthDate() {
        return mBirthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        mBirthDate = birthDate;
    }

    public String getReferredBy() {
        return mReferredBy;
    }

    public void setReferredBy(String referredBy) {
        mReferredBy = referredBy;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getStreet() {
        return mStreet;
    }

    public void setStreet(String street) {
        mStreet = street;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getZipCode() {
        return mZipCode;
    }

    public void setZipCode(String zipCode) {
        mZipCode = zipCode;
    }

    public Calendar getNextAppointmentDate() {
        return mNextAppointmentDate;
    }

    public void setNextAppointmentDate(Calendar nextAppointmentDate) {
        mNextAppointmentDate = nextAppointmentDate;
    }

    public Calendar getLastAppointmentDate() {
        return mLastAppointmentDate;
    }

    public void setLastAppointmentDate(Calendar lastAppointmentDate) {
        mLastAppointmentDate = lastAppointmentDate;
    }

    public String getPreferredAppointmentDay() {
        return mPreferredAppointmentDay;
    }

    public void setPreferredAppointmentDay(String preferredAppointmentDay) {
        mPreferredAppointmentDay = preferredAppointmentDay;
    }

    public Calendar getPreferredAppointmentTime() {
        return mPreferredAppointmentTime;
    }

    public void setPreferredAppointmentTime(Calendar preferredAppointmentTime) {
        mPreferredAppointmentTime = preferredAppointmentTime;
    }

    public String getStyleDescription() {
        return mStyleDescription;
    }

    public void setStyleDescription(String styleDescription) {
        mStyleDescription = styleDescription;
    }

    public String getHairPorosity() {
        return mHairPorosity;
    }

    public void setHairPorosity(String hairPorosity) {
        mHairPorosity = hairPorosity;
    }

    public String getHairTexture() {
        return mHairTexture;
    }

    public void setHairTexture(String hairTexture) {
        mHairTexture = hairTexture;
    }

    public String getHairComments() {
        return mHairComments;
    }

    public void setHairComments(String hairComments) {
        mHairComments = hairComments;
    }

    public String getCutLikes() {
        return mCutLikes;
    }

    public void setCutLikes(String cutLikes) {
        mCutLikes = cutLikes;
    }

    public String getCutDislikes() {
        return mCutDislikes;
    }

    public void setCutDislikes(String cutDislikes) {
        mCutDislikes = cutDislikes;
    }

    public String getColorTreatment() {
        return mColorTreatment;
    }

    public void setColorTreatment(String colorTreatment) {
        mColorTreatment = colorTreatment;
    }

    public String getColorFormula() {
        return mColorFormula;
    }

    public void setColorFormula(String colorFormula) {
        mColorFormula = colorFormula;
    }

    public String getComments() {
        return mComments;
    }

    public void setComments(String comments) {
        mComments = comments;
    }
}
