package com.okason.prontosalon.util;

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
}

