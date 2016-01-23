package com.okason.prontosalon.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

/**
 * Created by Valentine on 1/22/2016.
 */
public class ClientUtils {

    /**
     * Empty constructor to prevent instantiation.
     */
    protected ClientUtils(){}

    public  static UUID getNetId(){
        return UUID.randomUUID();
    }


    /**
     * Format last appointment date.
     *
     * @param lastAppointmentDate Next appointment date to format.
     * @return Formatted last appointment date.
     */
    public static String formatLastAppointmentDate(Calendar lastAppointmentDate) {
        if (lastAppointmentDate != null) {
            SimpleDateFormat date = new SimpleDateFormat("MMM d, y");

            return date.format(lastAppointmentDate.getTime());
        } else {
            return "";
        }
    }
}

