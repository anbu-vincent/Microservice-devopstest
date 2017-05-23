package com.devopstest.venue.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by demo
 */
@Data
public class ConsumerModel implements Serializable {

	private static final long serialVersionUID = -6641983907598420960L;
	private String reservationName;
    private long id;
}
