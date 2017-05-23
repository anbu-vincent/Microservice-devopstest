package com.devopstest.composite.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by demo
 */
@Data
public class PublishModel implements Serializable {

	private static final long serialVersionUID = 5672689509808851922L;
	private String reservationName;
    private long id;
}
