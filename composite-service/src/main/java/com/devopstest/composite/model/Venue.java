package com.devopstest.composite.model;

import lombok.Data;

/**
 * Created by demo
 */
@Data
public class Venue {
    private String venueName;
    private boolean isAvailable;
    private long reservationId;
    private String bookingDate;
    private String personName;
}
