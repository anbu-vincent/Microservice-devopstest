package com.devopstest.composite.model;

import lombok.Data;

import java.util.Collection;

/**
 * Created by demo
 */
@Data
public class BookingDetail {
    private Reservation reservation;
    private Collection<Venue> venues;
}