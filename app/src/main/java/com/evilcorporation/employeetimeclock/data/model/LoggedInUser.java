package com.evilcorporation.employeetimeclock.data.model;

import com.google.android.gms.vision.barcode.Barcode;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */

public class LoggedInUser {

    private String userId;
    private String displayName;
    private Barcode userBarcode;

    public LoggedInUser(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
